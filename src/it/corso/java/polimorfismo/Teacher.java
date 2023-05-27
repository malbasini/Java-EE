package it.corso.java.polimorfismo;

public class Teacher extends Person {
    private String nome;
    private String cognome;
    private String materia;

    public Teacher(String nome, String cognome, String materia){
         super(nome, cognome);
         this.nome = nome;
         this.cognome = cognome;
         this.materia = materia;
    }
    public void saluta(){
        System.out.println("Buongiorno ragazzi un saluto da " + this.nome + " " + this.cognome);
    }
}
