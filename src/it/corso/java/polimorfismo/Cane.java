package it.corso.java.polimorfismo;

public class Cane extends Mammifero {
    private String nome;

    public Cane(String nome){
        this.nome = nome;
    }
    //OVERRIDE DEL METODO toString() DELLA CLASSE OBJECT
    public String toString(){
        return "Il cane si chiama " + this.nome;
    }
}
