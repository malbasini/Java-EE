package it.corso.java.gestionefile;

import java.io.*;

public class ReadClassFile {

    public static void read(){
        try {
            String dir = new File(new File(".").getCanonicalPath() + File.separator + "test-dir").getPath();
            esempioFileReader(dir + File.separator + "lettura.txt");
            esempioBufferedReader(dir + File.separator + "lettura.txt");
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }

    public static void esempioBufferedReader(String filePath) {
        File f = new File(filePath);
        if(f.exists()) {
            BufferedReader fr = null;
            try {
                fr = new BufferedReader(new FileReader(f));
                char[] testo = new char[1024];
                int size = fr.read(testo);
                for(int i = 0; i < size; i++) {
                    System.out.print(testo[i]);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void esempioFileReader(String filePath) {
        File f = new File(filePath);
        if(f.exists()) {
            FileReader fr = null;
            try {
                fr = new FileReader(f);
                char[] testo = new char[1024];
                int size = fr.read(testo);
                for(int i = 0; i < size; i++) {
                    System.out.print(testo[i]);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
