package it.corso.java.generics;

public class Bottiglia<T>{
    private T t;
    public Bottiglia(T t) {
        this.t = t;
    }
    public T getContenuto() {
        return this.t;
    }
}
