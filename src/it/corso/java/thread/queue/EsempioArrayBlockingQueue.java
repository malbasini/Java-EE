package it.corso.java.thread.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
public class EsempioArrayBlockingQueue {
    public static void main(String[] args) {
        // Creo una coda che può contenere al massimo 10 elementi.
        BlockingQueue<String> queue = new ArrayBlockingQueue<String>(10);
        // Producer e Consumer accedono alla stessa coda...
        Thread prod = new Thread(new Produttore(queue));
        Thread cons = new Thread(new Consumatore(queue));
        prod.start();
        cons.start();
    }
}