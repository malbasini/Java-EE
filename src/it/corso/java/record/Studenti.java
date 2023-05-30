package it.corso.java.record;

public class Studenti {
    public record Studente1(String nome, int annoNascita){}
    public record Studente2(String nome, int annoNascita, MyRandom casuale){}

    public record Studente3(String nome, int annoNascita){
        public Studente3 (String nome, int annoNascita) {
            this.nome = nome.toUpperCase();
            this.annoNascita = annoNascita;
        }
    }

    public record Studente4(String nome, int annoNascita){
        public Studente4 (String nome, int annoNascita) {
            this.nome = nome.toUpperCase();
            this.annoNascita = annoNascita;
        }
        public Studente4(int annoNascita){
            this("Nessuno",annoNascita);
        }
    }
}
