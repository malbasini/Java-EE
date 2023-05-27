package it.corso.java.polimorfismo;

public class Mammifero extends Animale{
    public final void myMethod(){
        System.out.println("Sto eseguendo myMethod della classe Mammifero.");
    }

    public void mangia(){
        System.out.println("Sto eseguendo l'azione mangia.");
    }
}
