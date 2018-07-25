package com.cybermint.http;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.SSLException;
import javax.net.ssl.X509TrustManager;

import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.DefaultAsyncHttpClient;
import org.asynchttpclient.DefaultAsyncHttpClientConfig;
import org.asynchttpclient.proxy.ProxyServer;

import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.SslProvider;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;

public class URLConnectionPool {
	
	private static URLConnectionPool instance = null;
	private static int activeConnections = 0;
	private static int maxActiveConnections = 5000;
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
			
			System.setProperty("jsse.enableSNIExtension", "false");
			
			DefaultAsyncHttpClientConfig config = new DefaultAsyncHttpClientConfig.Builder()
					.setCompressionEnforced(true)
			        .setRequestTimeout(60000)
			        .setConnectTimeout(60000)
			        //.setMaxConnections(5000)
			        .setSslContext(sc)
			        .setUseInsecureTrustManager(true)
			        //.setMaxConnectionsPerHost(1000)
			        .setPooledConnectionIdleTimeout(100)
			        .setProxyServer(new ProxyServer.Builder("127.0.0.1", 24000))
			        .setConnectionTtl(500)
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
    	while(activeConnections>=maxActiveConnections) {
    		try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    	}
    	activeConnections++;
        return asyncHttpClient;
    }
    
    public static void reduceConnection() {
    	activeConnections--;
    }
    
    public static void setMaxActiveConnections(int maxActiveConnections) {
    	URLConnectionPool.maxActiveConnections = maxActiveConnections;
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
