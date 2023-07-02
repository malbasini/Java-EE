package it.corso.java.thread.queue;

import java.util.concurrent.BlockingQueue;

public class Produttore implements Runnable {
    private BlockingQueue<String> queue;
    public Produttore(BlockingQueue<String> queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        int i = 0;
        while(i < 30) {
            String elem = "Elemento numero " + i;
            /* provo ad aggiungere un elemento alla coda */
            boolean aggiunto = queue.offer(elem);
            System.out.println("L'elemento " + i + " è stato aggiunto? " + aggiunto);
            i++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}