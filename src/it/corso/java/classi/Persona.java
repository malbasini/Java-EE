package it.corso.java.classi;

public class Persona {
    /*--Dichiaro gli attributi come private*/ 
    private String nome;
    private String cognome;
    private int anni;
    /*--Dichiaro un attributo static come private che sarà il contatore
    delle istanze create.*/
    
    private static int contatore;
    
    /*--Costruttore che crea ed inizializza gli attributi
     * della classe Persona.
    */
    public Persona(String nome, String cognome, int anni){
        this.nome = nome;
        this.cognome = cognome;
        this.anni = anni;
    }
    public void denominazione(){
        System.out.println("Creato Persona di nome, cognome e anni " + this.nome + " " + this.cognome + " " +this.anni);
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
       this.nome = nome;
    }


    public static void incrementa(){
        contatore++;
    } 

    public static void decrementa(){
        contatore--;
    }

    public static void numeroIstanze(){
        System.out.println("Numero istanze create " + contatore);
    }
}
