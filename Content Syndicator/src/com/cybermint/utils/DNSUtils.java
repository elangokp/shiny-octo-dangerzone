package com.cybermint.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

public class DNSUtils {

	public Map<String,String> getIPByName(String domainName) {
		HashMap<String,String> DnsDetails = new HashMap<String,String>();
		try {
			InetAddress addr = InetAddress.getByName(domainName);
			//System.out.println(addr.getHostName());
			//System.out.println(addr.getCanonicalHostName());
			//System.out.println(addr.getHostAddress());
			String canonicalHostName = addr.getCanonicalHostName();
			String hostAddress = addr.getHostAddress();
			DnsDetails.put(canonicalHostName, hostAddress);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			DnsDetails.put("unknown", "unknown");
			System.out.println(e.getMessage());
		}
		return DnsDetails;
	}
	
	public static void main(String args[]) {
		DNSUtils d= new DNSUtils();
		d.getIPByName("madestrongtransformation.com");
	}
}
