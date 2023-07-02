package it.corso.java.thread.threadpool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class GetSitePage extends Thread {
    private String url;
    public GetSitePage(String url) {
        super();
        this.url = url;
    }
    @Override
    public void run() {
        try {
            URL site = new URL(url);
            URLConnection con = site.openConnection();
            InputStream in = con.getInputStream();
            String encoding = con.getContentEncoding();
            encoding = encoding == null ? "UTF-8" : encoding;
            System.out.println("************************************************");
            System.out.println("CONTENUTO DELLA PAGINA WEB: " + url);
            System.out.println(getString(in));
            System.out.println("************************************************");
        } catch (IOException e) {
            String a = e.getMessage();
            System.out.println(a);
        }
    }
    private String getString(InputStream is) {
        BufferedReader br = null;
        StringBuilder sb = new StringBuilder();
        String line;
        try {
            br = new BufferedReader(new InputStreamReader(is));
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }

        } catch (IOException e) {
            String a = e.getMessage();
            System.out.println(a);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    String a = e.getMessage();
                    System.out.println(a);
                }
            }
        }
        return sb.toString();
    }
}