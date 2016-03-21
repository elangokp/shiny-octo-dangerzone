/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cybermint.contentSyndicator.pages;

/*
 * Copyright (c) 2002-2010 Gargoyle Software Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.http.client.params.ClientPNames;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.CookieSpecFactory;
import org.apache.http.cookie.CookieSpecRegistry;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.cookie.BrowserCompatSpec;
import org.apache.http.params.HttpParams;

import com.gargoylesoftware.htmlunit.CookieManager;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.util.Cookie;

/**
 * Manages cookies for a {@link WebClient}. This class is thread-safe.
 *
 * @version $Revision: 5899 $
 * @author Daniel Gredler
 * @author Ahmed Ashour
 * @author Nicolas Belisle
 */
public class MyCookieManager extends CookieManager {

    /** Whether or not cookies are enabled. */
    private boolean cookiesEnabled_;

    /** The cookies added to this cookie manager. */
    private final Set<Cookie> cookies_;

    /** The cookies spec registry */
    private final transient CookieSpecRegistry registry_ = new DefaultHttpClient().getCookieSpecs();

    public MyCookieManager() {
        cookiesEnabled_ = true;
        cookies_ = new LinkedHashSet<Cookie>();
    }


    /**
     * Returns the currently configured cookies applicable to the specified URL, in an unmodifiable set.
     * @param url the URL on which to filter the returned cookies
     * @return the currently configured cookies applicable to the specified URL, in an unmodifiable set
     */
    public synchronized Set<Cookie> getCookies(final URL url) {
        final String host = url.getHost();
        final String path = url.getPath();
        final boolean secure = "https".equals(url.getProtocol());

        final int port;
        if (url.getPort() != -1) {
            port = url.getPort();
        }
        else {
            port = url.getDefaultPort();
        }

        // discard expired cookies
        final Date now = new Date();
        for (final Iterator<Cookie> iter = cookies_.iterator(); iter.hasNext();) {
            final Cookie cookie = iter.next();
            if (cookie.getExpires() != null && now.after(cookie.getExpires())) {
                iter.remove();
            }
        }

        CookieSpecFactory csf = new CookieSpecFactory() {

            public CookieSpec newInstance(HttpParams params) {
                return new BrowserCompatSpec() {

                    public void validate(Cookie cookie, CookieOrigin origin)
                            throws MalformedCookieException {
                        // Oh, I am easy
                    }
                };
            }
        };

        DefaultHttpClient httpclient = new DefaultHttpClient();
        httpclient.getCookieSpecs().register("easy", csf);
        httpclient.getParams().setParameter(
                ClientPNames.COOKIE_POLICY, "easy");
        CookieSpecRegistry registry1 = httpclient.getCookieSpecs();


        final CookieSpec spec = registry1.getCookieSpec("easy");
        final org.apache.http.cookie.Cookie[] all = Cookie.toHttpClient(cookies_);
        final CookieOrigin cookieOrigin = new CookieOrigin(host, port, path, secure);
        final List<org.apache.http.cookie.Cookie> matches = new ArrayList<org.apache.http.cookie.Cookie>();
        for (final org.apache.http.cookie.Cookie cookie : all) {
            //if (spec.match(cookie, cookieOrigin)) {
                matches.add(cookie);
            //}
        }

        final Set<Cookie> cookies = new LinkedHashSet<Cookie>();
        cookies.addAll(Cookie.fromHttpClient(matches));
        return Collections.unmodifiableSet(cookies);
    }


}
