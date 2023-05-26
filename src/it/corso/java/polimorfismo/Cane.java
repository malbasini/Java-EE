package it.corso.java.polimorfismo;

public class Cane extends Mammifero {
    private String nome;
    private String razza;

    public Cane(String nome, String razza){
        this.nome = nome;
        this.razza = razza;
    }
    //OVERRIDE DEL METODO toString() DELLA CLASSE OBJECT
    public String toString(){
        return "Il mio cane si chiama " + this.nome + " ed è un " + this.razza;
    }
}
