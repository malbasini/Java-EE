package it.corso.java.array;
import it.corso.java.classi.*;

public class Array {

    public static void arrayPersone(){
        Persona p1 = new Persona("Mario", "Rossi", 32);
        Persona p2 = new Persona("Anna", "Bianchi", 42);
        Persona p3 = new Persona("Luigi", "Verdi", 54);
        /*Dichiaro un Array monodimensionale di oggetti Persona */
        Persona array[] = {p1,p2,p3};
        for (Persona persona : array) {
            persona.denominazione();
        }
    }
    //Array Bidimensionale
    public static void arrayBidimensionale(){
        int myArray[][] = new int[3][5];
        for(int x = 0; x < 3; x++){
            for (int y = 0; y < 5; y++ ){
                myArray[x][y] = x * y;
                System.out.println(myArray[x][y]);
            }
        } 
    }
}
