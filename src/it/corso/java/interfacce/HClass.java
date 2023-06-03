package it.corso.java.interfacce;

public class HClass implements IMyInterface1,IMyInterface2{

    @Override
    public void myMethod1() {
        System.out.println("Sto eseguendo myMethod1 di HClass.");
    }

    @Override
    public void myMethod2() {
        System.out.println("Sto eseguendo myMethod2 di HClass.");
    }
}
