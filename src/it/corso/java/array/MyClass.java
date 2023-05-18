package it.corso.java.array;

public class MyClass {
    public void varargs(int x, boolean b, char ... arg){
        System.out.print("Parametri: " + x + " " + b + " ");
        for(char a : arg)
            System.out.print(a + " ");
        System.out.println();
    }
}


