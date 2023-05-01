package it.corso.java.operatori;

public class TestOperatori {
    public static void assegnamento(){
        int myVar = 250;
        System.out.println("myVar = " + myVar);//250
        myVar = (5+5-2)*2;
        System.out.println("myVar = " + myVar);//16
        String hello = helloWorld();
        System.out.println("hello = " + hello);//Ciao Mondo!
    }

    private static String helloWorld() {
        return "Ciao Mondo!";
    }
    public static void incremento(){
        int x, y = 15;
        x = 10 + ++y;
        System.out.println("Preincremento x vale " + x);
        System.out.println("Preincremento y vale " + y);
        y = 15;
        x = 10 + y++;
        System.out.println("Postincremento x vale " + x);
        System.out.println("Postincremento y vale " + y);
        y = 15;
        x = 10 + --y;
        System.out.println("Predecremento x vale " + x);
        System.out.println("Predecremento y vale " + y);
        y = 15;
        x = 10 + y--;
        System.out.println("Postdecremento x vale " + x);
        System.out.println("Postdecremento y vale " + y);
    }
    public static void operatoriLogici(){
        int x = 10, y = 15, z = 5;
        boolean result = false;
        result = !((x > y) & (z == 5) | (x > z)); //false
        System.out.println("result vale " + result); 
        /*Analizziamo l'espressione
         * 
         * x > y = false
         * z == 5 true
         * 
         * false & true = false
         * 
         * Analizziamo ora la parte più a destra l'or per intenderci
         * 
         * x > z = true
         * 
         * 
         * false | true = true
         * 
         * !(true) = false
        */
    }
    public static void casting(){
        int x;
        double d;
        d = 100.50;
        x = (int)d;
        System.out.println("Cast di int a double vale " +x);
        byte b; 
        short a;
        a = 256;
        b = (byte)a; //Esempio di overflow (traboccamento)
        System.out.println("b dovrebbe valore 256 ma il suo valore è " +b);
        a = 20;
        b = (byte)a; 
        System.out.println("b dovrebbe valore 20. " +b);
    
    }
    public static void operatoreTernario(){
        int anni = 19;
        String risposta;
        risposta = (anni >= 18) ? "Puoi guidare" : "Non puoi guidare";
        System.out.println(risposta);
    }
}
