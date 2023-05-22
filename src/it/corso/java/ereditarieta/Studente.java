package it.corso.java.ereditarieta;
import it.corso.java.classi.*;

public class Studente extends Persona {

    private String corsoDiLaurea;
    private int anniMancanti;

    public Studente(String nome, String cognome, int anni, String corsoDiLaurea, int anniMancanti){
        super(nome,cognome,anni);
        this.corsoDiLaurea = corsoDiLaurea;
        this.anniMancanti = anniMancanti;

    }
    public String denominazione(){
        String denominazione = super.denominazione();
        return("Creato studente " + denominazione + " corso frequentato " + this.corsoDiLaurea + " anni mancanti " + this.anniMancanti);
    }
}
