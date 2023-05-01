package it.corso.java.datatype;

public class DataType {
    public static void typeInference(){
        var myVar = 250;
        System.out.println("Il tipo di myVar è " + ((Object) myVar).getClass().getSimpleName());
    }
    public static void scientificNotation(){
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println("Value of 35e3f " + f1);
        System.out.println("Value of 12E4d " + d1);
    }

    public static void displayChar(){
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println("Codice ASCII 65 " + myVar1);
        System.out.println("Codice ASCII 66 " + myVar2);
        System.out.println("Codice ASCII 67 " + myVar3);
    }

    public static void displayString(){
        String txt = "Hello World";
        System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt.toLowerCase());   // Outputs "hello world"
        System.out.println(txt.indexOf( "World" )); // Outputs 6 
    }
}
