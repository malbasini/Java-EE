package it.corso.java.thread.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EsempioThreadPool {
    public static void main(String[ ] args) {
        /* creo il thread pool */
        ExecutorService pool = Executors.newCachedThreadPool();
        /* aggiunge i thread al pool */
        pool.execute(new GetSitePage("https://www.marcoalbasini.com"));
        pool.execute(new GetSitePage("https://www.google.it"));
        pool.execute(new GetSitePage("https://www.amazon.com"));
        pool.shutdown();
    }
}
