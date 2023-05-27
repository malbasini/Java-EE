package it.corso.java.polimorfismo;

public class Person extends Object {
    private String nome;
    private String cognome;

    public Person(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
    }

    public void saluta(){
        System.out.println("Un saluto da " + this.nome + " " + this.cognome);
    }
}
