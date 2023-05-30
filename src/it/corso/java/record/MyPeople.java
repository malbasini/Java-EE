package it.corso.java.record;

public class MyPeople {
    public record MyPerson(String nome, int annoNascita){}
    public record MyPerson1(String nome, int annoNascita, MyRandom casuale){}

    public record MyPerson3(String nome, int annoNascita){
        public MyPerson3 (String nome, int annoNascita) {
            this.nome = nome.toUpperCase();
            this.annoNascita = annoNascita;
        }
    }

    public record MyPerson4(String nome, int annoNascita){
        public MyPerson4 (String nome, int annoNascita) {
            this.nome = nome.toUpperCase();
            this.annoNascita = annoNascita;
        }
        public MyPerson4(int annoNascita){
            this("Nessuno",annoNascita);
        }
    }
}
