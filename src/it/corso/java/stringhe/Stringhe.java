package it.corso.java.stringhe;

public class Stringhe {
    private String s = "Corso Java";
    public void methodString(){
        /* Restituisce il carattere che si trova nell'indice passato
         * come parametro. Gli indici partono da 0.
         */
        char c = s.charAt(0);
        System.out.println("Metodo charAt(index): " + c);
        /* Restutuisce la sottostringa contenuta fra gli indici
         * passati come parametro.
         */
        String a = s.substring(0, 5);
        System.out.println("Metodo substring(beginindex,endindex): " + a);
        int b = s.length();
        /* Restituisce la lunghezza della stringa */
        System.out.println("Metodo length: " + b);

        //PER GLI ALTRI METODI CONSULTARE LA DOCUMENTAZIONE IN LINEA.
    }
}
