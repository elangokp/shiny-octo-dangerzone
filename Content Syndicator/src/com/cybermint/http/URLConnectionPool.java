package com.cybermint.http;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.SSLException;
import javax.net.ssl.X509TrustManager;

import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.DefaultAsyncHttpClient;
import org.asynchttpclient.DefaultAsyncHttpClientConfig;

import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.SslProvider;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;

public class URLConnectionPool {
	
	private static URLConnectionPool instance = null;
	private AsyncHttpClient asyncHttpClient;

	public URLConnectionPool() {
		try {
			/*
			TrustManager[] trustManagers = new TrustManager[] { new DummyTrustManager() }; 
			List<KeyManager> keyManagers = new ArrayList<KeyManager>(); 
			
			SSLContext context = SSLContext.getInstance("SSL");
			context.init( new KeyManager[] {}, trustManagers, null );
			*/
			SslContext sc  = SslContextBuilder
				    .forClient()
				    .sslProvider(SslProvider.JDK)
				    .trustManager(InsecureTrustManagerFactory.INSTANCE)
				    .build();
			
			
			DefaultAsyncHttpClientConfig config = new DefaultAsyncHttpClientConfig.Builder()
					.setCompressionEnforced(true)
			        .setRequestTimeout(60000)
			        .setConnectTimeout(60000)
			        .setSslContext(sc)
			        .setUseInsecureTrustManager(true)
			        .build();
			asyncHttpClient = new DefaultAsyncHttpClient(config);
			
		} catch (SSLException e) {
			e.printStackTrace();
		}
	}
	
	 public static URLConnectionPool getInstance() {  
    	if (instance == null) {
    		instance = new URLConnectionPool();
    	}
        return instance;  
    }  

    public AsyncHttpClient getClient()  {  
        return asyncHttpClient;
    }
    
    final class DummyTrustManager 
    implements X509TrustManager 
	{ 
	 
		@Override
		public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
			// TODO Auto-generated method stub
			
		}
	
		@Override
		public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
			// TODO Auto-generated method stub
			
		}
	
		@Override
		public X509Certificate[] getAcceptedIssuers() {
			// TODO Auto-generated method stub
			return new X509Certificate[0];
		} 
	 
	}

}
