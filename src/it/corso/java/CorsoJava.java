package it.corso.java;
import it.corso.java.variabili.*;
import it.corso.java.datatype.*;
import it.corso.java.operatori.*;
import it.corso.java.controllodiflusso.*;
import it.corso.java.classi.*;
import it.corso.java.array.*;
import it.corso.java.stringhe.*;
import it.corso.java.ereditarieta.*;
import it.corso.java.ereditarieta.BClass;
import it.corso.java.gerarchia.CClass;
import it.corso.java.polimorfismo.*;
import it.corso.java.record.MyRandom;


public class CorsoJava {
    record MyPerson(String nome, int annoNascita){}
    record MyPerson1(String nome, int annoNascita, MyRandom casuale){}

    record MyPerson3(String nome, int annoNascita){
        public MyPerson3 (String nome, int annoNascita) {
            this.nome = nome.toUpperCase();
            this.annoNascita = annoNascita;
        }
    }

    record MyPerson4(String nome, int annoNascita){
        public MyPerson4 (String nome, int annoNascita) {
            this.nome = nome.toUpperCase();
            this.annoNascita = annoNascita;
        }
        public MyPerson4(int annoNascita){
            this("Nessuno",annoNascita);
        }
    }
    public static void main(String[] args) {
        /*CorsoJava.variabili();
        CorsoJava.dataType();
        CorsoJava.operatori();
        CorsoJava.controlloDiFlusso();
        CorsoJava.testClassi();
        CorsoJava.testArray();
        CorsoJava.testStringhe();
        CorsoJava.testEreditarieta();*/
        CorsoJava.record();
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
        System.out.println(p1.denominazione());
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
        System.out.println(p.denominazione());
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

    public static void testEreditarieta(){
        
        /*Creo l'oggetto Studente */
        Studente studente = new Studente("Mario", "Rossi", 24, "Giurisprudenza", 2);
        System.out.println(studente.denominazione());
        BClass bc = new BClass();
        bc.view();
        System.out.println(bc.stringa); 
        EClass ec = new EClass();
        DClass dc = new DClass();
        ec = dc; 
        /* Viene accettata l'assegnazione, ma si produce un errore
         * se con la variabile reference ec andiamo a chiamare
         * membri della sottoclasse.
         */
        ec.eMethod();
        dc.dMethod();
        //Gerarchia di classi
        CClass cc = new CClass("Primo", "Secondo", "Terzo");
        System.out.println(cc.stringa + " " + cc.str + " " + cc.s); //Primo Secondo Terzo
        /*DEFINIZIONE DI POLIMORFISMO
         * Consiste nella possibilità che una sottoclasse A di una data
         * classe B ridefinisca uno dei metodi della super-classe e 
         * che quindi quando verrà utilizzata una istanza della classe A
         * le invocazioni al metodo ridefinito (spesso detto overridden) 
         * eseguiranno il codice definito nella sotto-classe.
         */
        Animale a = new Insetto();
        Animale b = new Mammifero();
        a.myMethod();
        b.myMethod();
        Cane c = new Cane("Dick","Labrador");
        c.mangia();
        System.out.println(c.toString());
        Student s1 = new Student("Luca", "Verdi", 5);
        Student s2 = new Student("Franco", "Bianchi", 4);
        Teacher t1 = new Teacher("Maria","Rossi" ,"Matematica");
        Teacher t2 = new Teacher("Marco","Albasini" ,"Storia");
        Person[] array = {s1,s2,t1,t2};
        for(Person x : array){
            x.saluta();
        }
    }
    public static void record(){
        MyPerson p1 = new MyPerson("Susanna Verdi", 1982);
        MyPerson p2 = new MyPerson("Mario Rossi",1990);
        MyPerson p3 = new MyPerson("Mario Rossi",1990);
        System.out.println(p1.nome() + " " + p1.annoNascita());
        System.out.println(p2);
        System.out.println(p2.equals(p3));
        System.out.println(p3.hashCode() + " " + p2.hashCode());
        System.out.println(p1.hashCode());

        //SUPERFICIALMENTE IMMUTABILI
        MyRandom mr1 = new MyRandom();
        MyPerson1 p4 = new MyPerson1("Susanna Verdi",1982,mr1);
        mr1.setValore();
        System.out.println(p4.casuale.getValore());
        mr1.setValore();
        System.out.println(p4.casuale.getValore());

        //CANONICAL CONSTRUCTOR

        MyPerson3 p = new MyPerson3("Susanna Verdi",1982);
        System.out.println(p);

        //NON-CANONICAL CONSTRUCTOR

        MyPerson4 p5 = new MyPerson4(1982);
        System.out.println(p5);




    }
    
}