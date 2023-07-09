package it.corso.java.gestionefile;

import java.io.File;
import java.io.IOException;

public class TestFileClass {

    public static void create(){
        try {
            //CREO IL PATH PER LA LA DIRECTORY
            File f1 = new File(new File(".").getCanonicalPath() + File.separator + "test-dir");
            String dir = f1.getPath();
            //PATH DEL FILE
            String file = dir + File.separator + "test-file.txt";
            //CREO LA DIRECTORY
            creaDirectory(dir);
            //CREO IL FILE
            creaFile(file);
            //CREO I FILE PER LA LETTURA/SCRITTURA
            String file1 = dir + File.separator + "buffered-writer.txt";
            creaFile(file1);
            String file2_1 = dir + File.separator + "file-writer.txt";
            creaFile(file2_1);
            String file3 = dir + File.separator + "lettura.txt";
            creaFile(file3);
            File d = new File(dir);
            System.out.println(d.isDirectory());
            File f = new File(file);
            System.out.println(f.isFile());
            File[] files = d.listFiles();
            for (File file2 : files) {
                System.out.println(file2.getName());
            }
        }
        catch(IOException e){
            String a = e.getMessage();
            System.out.println(a);
        }
    }
    public static void creaFile(String path) {
        File f = new File(path);
        if(!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void creaDirectory(String path) {
        File d = new File(path);
        if(!d.exists()) {
            d.mkdir();
        }
    }
}
