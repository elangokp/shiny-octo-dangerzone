package com.cybermint.http;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;

import com.cybermint.utils.custom.WebScraperUtils;

public class LuminatiClientExample implements Runnable {
    public static final int n_parallel_exit_nodes = 1;
    public static final int n_total_req = 1;
    public static final int switch_ip_every_n_req = 40;
    public static AtomicInteger at_req = new AtomicInteger(0);
    public static String host;

    public static void main(String[] args) {
        System.out.println("To enable your free eval account and get "
            +"CUSTOMER, YOURZONE and YOURPASS, please contact "
            +"sales@luminati.io");
        try {
            int proxy_session_id = new Random().nextInt(Integer.MAX_VALUE);
            InetAddress address = InetAddress.getByName("session-"+proxy_session_id+".zproxy.lum-superproxy.io");
            host = address.getHostAddress();
            ExecutorService executor =
                Executors.newFixedThreadPool(n_parallel_exit_nodes);
            for (int i = 0; i < n_parallel_exit_nodes; i++)
                executor.execute(new LuminatiClientExample());
            executor.shutdown();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
    	LuminatiProxyClient client = new LuminatiProxyClient(null, host);
        while (at_req.getAndAdd(1) < n_total_req) {
            if (!client.have_good_super_proxy())
                client.switch_session_id();
            if (client.n_req_for_exit_node == switch_ip_every_n_req)
                client.switch_session_id();
            CloseableHttpResponse response = null;
            try {
                response = client.request("http://usefuluniques.com", WebScraperUtils.getInstance().getRandomUserAgentString());
                int code = response.getStatusLine().getStatusCode();
                System.out.println(code != 200 ? code :
                        EntityUtils.toString(response.getEntity()));
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } finally {
                try {
                    if (response != null)
                        response.close();
                } catch (Exception e) {}
            }
        }
        client.close();
    }
}
