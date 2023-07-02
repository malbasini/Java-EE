package it.corso.java.polimorfismo;

public class Student extends Person {
    private String nome;
    private String cognome;
    private int anno;

    public Student(String nome, String cognome, int anno){
         super(nome, cognome);
         this.nome = nome;
         this.cognome = cognome;
         this.anno = anno;
    }
    public void saluta(){
        System.out.println("Buongiorno prof un saluto da " + this.nome + " " + this.cognome + " al " + this.anno + " anno.");
    }
}
