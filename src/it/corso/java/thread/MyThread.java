package it.corso.java.thread;

public class MyThread extends Thread{
    @Override
    public void run(){
        for(int i=0; i<10; i++)
            System.out.println("Io sono " + MyThread.class.getSimpleName() + " ed i vale " + i);
    }
}