package it.corso.java.gestionefile;

import java.io.*;

public class WriteClassFile {

    public static void write() {
        try {
            String dir = new File(new File(".").getCanonicalPath() + File.separator + "test-dir").getPath();
            esempioBufferedFileWriter(dir + File.separator + "buffered-writer.txt", new String[]{"Marco", "Albasini", "Corso Java", "Avanzato!"});
            esempioFileWriter(dir + File.separator + "file-writer.txt", new String("Corso Java avanzato"));
        }
        catch(IOException e) {
          e.printStackTrace();
        }
    }

    public static void esempioPrintWriter(String filePath, String[] testo) {
        PrintWriter pw = null;

        try {
            pw = new PrintWriter(new FileWriter(getFile(filePath)));

            for (String string : testo) {
                pw.write(string);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            pw.close();
        }
    }

    public static void esempioBufferedFileWriter(String filePath, String[] testo) {

        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter(getFile(filePath)));

            for (String string : testo) {
                bw.write(string);
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void esempioFileWriter(String filePath, String testo) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(getFile(filePath));
            fw.write(testo);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static File getFile(String filePath) {
        File file = new File(filePath);

        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return file;
    }
}
