/**
 * 
 */
package com.cybermint.httpProxyManagement;

import com.cybermint.httpProxyManagement.exceptions.MalformedProxyFormatException;

/**
 * @author Elango
 * 
 */
public class HttpProxy {

	private String host;
	private Integer port;
	private String username;
	private String password;
	private Boolean isGoogleBlocked;

	public HttpProxy(String host, Integer port, String username, String password) {
		this.host = host;
		this.port = port;
		this.username = username;
		this.password = password;
	}

	public HttpProxy(String host, Integer port) {
		this.host = host;
		this.port = port;
	}

	public HttpProxy(String givenProxyString)
			throws MalformedProxyFormatException {
		String[] proxyComponents = null;
		if(null==givenProxyString || "".equalsIgnoreCase(givenProxyString)){
			throw new MalformedProxyFormatException("Malformed Proxy Format - Given Proxy String is empty");
		}
		try {
			proxyComponents = givenProxyString.trim().split(":");
		} catch (Exception e) {
			e.printStackTrace();
			throw new MalformedProxyFormatException("Malformed Proxy Format - Proxy should be in IP:PORT:USERNAME:PASSWORD format", e);
		}
		if (proxyComponents.length == 2) {
			this.host = proxyComponents[0];
			this.port = Integer.parseInt(proxyComponents[1]);
		} else if (proxyComponents.length == 4) {
			this.host = proxyComponents[0];
			this.port = Integer.parseInt(proxyComponents[1]);
			this.username = proxyComponents[2];
			this.password = proxyComponents[3];
		}  else {
			throw new MalformedProxyFormatException("Malformed Proxy Format - Proxy should be in IP:PORT:USERNAME:PASSWORD format");
		}
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getIsGoogleBlocked() {
		return isGoogleBlocked;
	}

	public void setIsGoogleBlocked(Boolean isGoogleBlocked) {
		this.isGoogleBlocked = isGoogleBlocked;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
