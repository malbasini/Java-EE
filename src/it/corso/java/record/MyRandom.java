package it.corso.java.record;
import java.util.Random;
public class MyRandom {

    private int valore = 0;
    private final Random r = new Random();

    public void setValore(){
         valore = r.nextInt(50);
    }

    public int getValore(){
        return valore;
    }
}
