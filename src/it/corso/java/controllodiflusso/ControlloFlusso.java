package it.corso.java.controllodiflusso;

import java.util.Random;

public class ControlloFlusso {
    public static void primaStruttura(){
        
        Random random = new Random();
        // genera numero casuale tra 0 e 5
        int number = random.nextInt(6);
        if (number >= 0 && number <=2){
            System.out.println("Estratto un numero compreso tra 0 e 2 " + number);
        }else if (number == 3){
            System.out.println("Estratto il numero " + number);
        }else if (number == 4){
            System.out.println("Estratto il numero " + number);
        }
        else{
            System.out.println("Estratto il numero " + number);
        }
    }
    public static void secondaStruttura(){
        Random random = new Random();
        // genera numero casuale tra 0 e 10
        int myNumber = random.nextInt(11);
        //switch statement
        switch (myNumber){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("E' uscito un numero compreso tra 0 e 5 " + myNumber);
                break;
            case 6:
                System.out.println("E' uscito il numero 6");
                break;
            case 7:
                System.out.println("E' uscito il numero 7");
                break;
            default:
                System.out.println("E' uscito un numero compreso tra 8 e 10");
                break;
        }
    }
    public static void switchExpression(){
        Random random = new Random();
        // genera numero casuale tra 0 e 5
        byte myNumber = (byte)random.nextInt(6);
        //switch expression
        byte number = 0;
        number = switch(myNumber){
        case 0:
            yield 0;//Ritorna 0
        case 1:
            yield 1;//Ritorna 1
        case 2:
            yield 2;//Ritorna 2
        default:
            yield number;   
        };
        System.out.println("Il numero uscito è: " + number);
    }
    public static void arrowCase(){
        int x = 20;
        //Arrow case
        String nome = switch(x){
            case 10 -> {
                System.out.println("Torno dieci");
                yield "dieci";
            }
            case 20 -> {
                System.out.println("Torno venti");
                yield "venti";
            }
            default -> {
                System.out.println("Torno qualunque");
                yield "qualunque";
            }
        };
        System.out.println(nome);
    }
    public static void cicloWhile(){
        Random random = new Random();
        while(true){
            // genera numero casuale tra 0 e 10
            byte myNumber = (byte)random.nextInt(11);
            System.out.println("myNumber vale: " + myNumber);
            if (myNumber >= 5)
                break;//Esce dal loop
            else
                continue;//Torna in testa al ciclo
        }
    }
    public static void cicloFor(){
        for(int x = 10; x >= 0 ; x--){
           //Stampo i numeri 10-8-6-4-2-0 
           if (x % 2 == 0)
             System.out.println(x); 
        }
    }
}
