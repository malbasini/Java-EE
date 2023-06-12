package it.corso.java.eccezioni;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    /*Metodo che legge un file di testo passato come input.*/
    public static void ReadTextFile() throws IOException {
        //CAMBIARE IL PATH DEL FILE
        //PER SIMULARE L'ECCEZIONE IMMETTERE UN NOME DI FILE INESISTENTE
        BufferedReader reader = new BufferedReader(new FileReader("/Users/marcoalbasini/Documents/Documenti/Blog/Blog parte Web/JAVA/Code/CorsoJava/src/file.txt"));
        String line = reader.readLine();
        while(line!=null) {
            System.out.println(line);
            line = reader.readLine();
        }
        reader.close();
    }
}
