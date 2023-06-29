package it.corso.java.multithreading;

public class ThreadDemo extends Thread{
    private Thread t;
    private String nomeThread;
    public ThreadDemo(String nomeThread) throws java.lang.InterruptedException{
        super();
        this.nomeThread = nomeThread;
    }
    @Override
    public void run(){
        for(int i = 0; i < 10; i++) {
            System.out.println("Il Thread " + nomeThread + " è nel ciclo for e i vale " + i);
            System.out.println("Il Thread " + nomeThread + " è nello stato " + Thread.currentThread().getState());
            try {
                /* dopo aver stampato il numero, il thread viene posto in stato sleep per 3 secondi */
                Thread.sleep(3000);
                System.out.println("Il Thread " + nomeThread + " è nello stato SLEEP.");
            }
            catch(InterruptedException e){
               String a = e .getMessage();
               System.out.println(a);
            }
        }
    }
    public void start(){
        if(t==null){
            t = new Thread(this,nomeThread);/* un nuovo thread viene creato */
            System.out.println("Il Thread " + nomeThread + " è nello stato " + t.getState());
            t.start();
        }
    }
}
