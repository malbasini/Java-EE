package it.corso.java;
import it.corso.java.variabili.*;
import it.corso.java.datatype.*;
import it.corso.java.operatori.*;
import it.corso.java.controllodiflusso.*;
import it.corso.java.classi.*;
import it.corso.java.array.*;
import it.corso.java.stringhe.*;


public class CorsoJava {

    public static void main(String[] args) {
        /*CorsoJava.variabili();
        CorsoJava.dataType();
        CorsoJava.operatori();
        CorsoJava.controlloDiFlusso();
        CorsoJava.testClassi();
        CorsoJava.testArray();*/
        CorsoJava.testStringhe();
    }

    public static void variabili(){
        TestVariabili.myNumber = 10;
        TestVariabili test = new TestVariabili();
        test.myMethod();
        test.variabileIstanza();
        test.testParametri("Marco", "Albasini", 54);
    }
    public static void dataType(){
        DataType.displayChar();
        DataType.typeInference();
        DataType.scientificNotation();
        DataType.displayString();
    }
    public static void operatori(){
        TestOperatori.assegnamento();
        TestOperatori.incremento();
        TestOperatori.operatoriLogici();
        TestOperatori.casting();
        TestOperatori.operatoreTernario();
    }
    public static void controlloDiFlusso(){
        ControlloFlusso.primaStruttura();
        ControlloFlusso.secondaStruttura();
        ControlloFlusso.switchExpression();
        ControlloFlusso.arrowCase();
        ControlloFlusso.cicloWhile();
        ControlloFlusso.cicloFor();
    }
    public static void testClassi(){
        Persona p1 = new Persona("Mario","Rossi",23);
        Persona.incrementa();
        Persona p2 = new Persona("Luigi","Bianchi",41);
        Persona.incrementa();
        p1.denominazione();
        Persona.numeroIstanze();
        /*Vediamo i reference */
        System.out.println(p1.getNome());
        System.out.println(p2.getNome());
        p1 = p2;//copia dei reference
        System.out.println(p1.getNome());
        System.out.println(p2.getNome());
        p1.setNome("Franco");
        System.out.println(p1.getNome());
        System.out.println(p2.getNome());
        p2.setNome("Luisa");
        System.out.println(p1.getNome());
        System.out.println(p2.getNome());
        /* Avendo fatto l'assegnamento p1=p2
         * qualsiasi modifica fatta ad una delle
         * due istanze si ripercuote sull'altra
         * in quanto condividono la stessa area di
         * memoria.
         */
        //Overload dei costruttori
        Persona p = new Persona("Mario", "Rossi");
        p.denominazione();
        //Blocc static
        Static s1 = new Static();
        Static s2 = new Static();
        s1.view();
        s2.view();
    }

    public static void testArray(){
        Array.arrayPersone();
        Array.arrayBidimensionale();
        MyClass mc = new MyClass();
        mc.varargs(2, true,'a','b','c','o','p');
        mc.varargs( 7, false, 'e','f','g','h');
        mc.varargs(34, true, 'l','m','n');
        Overload ov = new Overload();
        ov.varargs(2,3,4,5,6);
        ov.varargs(10.90,67.890,78.89);
        ov.varargs();/*??? Non va in errore ma non entra nel loop 
        chiamando il primo metodo in overload. */
    }

    public static void testStringhe(){
        Stringhe s = new Stringhe();
        s.methodString();
    }
    
}
