package it.corso.java.concorrenza;
import it.corso.java.Utils;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
public class GetSitePageThread extends Thread {
    private String url;
    private String content;
    public GetSitePageThread(String url) {
        super();
        this.url = url;
    }
    @Override
    public void run() {
        try {
            URL u = new URL(url);
            URLConnection con = u.openConnection();
            InputStream is = con.getInputStream();
            setContent(Utils.getString(is));

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    }
