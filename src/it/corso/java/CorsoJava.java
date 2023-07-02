package it.corso.java;
import it.corso.java.interfacce.*;
import it.corso.java.thread.lock.Contatore;
import it.corso.java.thread.lock.ReentrantLockEsempio;
import it.corso.java.thread.multithreading.ThreadDemo;
import it.corso.java.thread.syncronized.Cliente;
import it.corso.java.thread.MyRunnable;
import it.corso.java.thread.MyThread;
import it.corso.java.variabili.*;
import it.corso.java.datatype.*;
import it.corso.java.operatori.*;
import it.corso.java.controllodiflusso.*;
import it.corso.java.classi.*;
import it.corso.java.array.*;
import it.corso.java.stringhe.*;
import it.corso.java.ereditarieta.*;
import it.corso.java.gerarchia.CClass;
import it.corso.java.polimorfismo.*;
import it.corso.java.record.MyRandom;
import it.corso.java.record.Studenti.Studente1;
import it.corso.java.record.Studenti.Studente2;
import it.corso.java.record.Studenti.Studente3;
import it.corso.java.record.Studenti.Studente4;
import it.corso.java.enumerazioni.Enumerazioni.*;
import it.corso.java.lambda.*;
import it.corso.java.generics.*;
import it.corso.java.eccezioni.*;
import it.corso.java.thread.concorrenza.*;
import it.corso.java.thread.prodcons.*;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("all")
public class CorsoJava {
    public static void main(String[] args) {
        CorsoJava.variabili();
        CorsoJava.dataType();
        CorsoJava.operatori();
        CorsoJava.controlloDiFlusso();
        CorsoJava.testClassi();
        CorsoJava.testArray();
        CorsoJava.testStringhe();
        CorsoJava.testEreditarieta();
        CorsoJava.record();
        CorsoJava.interfacce();
        CorsoJava.Enumerazioni();
        CorsoJava.LeggiFile();
        CorsoJava.Generics();
        CorsoJava.lambda();
        //CorsoJava.thread();
    }

    private static void Enumerazioni() {
        //SCHEMA ORDINALE
        GiorniDellaSettimana g = GiorniDellaSettimana.GIOVEDI;
        int v = g.ordinal();
        int pos = g.compareTo(GiorniDellaSettimana.GIOVEDI);
        System.out.println(v);
        System.out.println(pos);
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
        Studente1 s1 = new Studente1("Susanna Verdi", 1992);
        Studente1 s2 = new Studente1("Mario Rossi",1990);
        Studente1 s3 = new Studente1("Mario Rossi",1990);
        System.out.println(s1.nome() + " " + s1.annoNascita());
        System.out.println(s2);
        System.out.println(s2.equals(s3));
        System.out.println(s3.hashCode() + " " + s2.hashCode());
        System.out.println(s1.hashCode());

        //SUPERFICIALMENTE IMMUTABILI
        MyRandom mr1 = new MyRandom();
        Studente2 st2 = new Studente2("Susanna Verdi",1992,mr1);
        mr1.setValore();
        System.out.println(st2.casuale().getValore());
        mr1.setValore();
        System.out.println(st2.casuale().getValore());

        //CANONICAL CONSTRUCTOR

        Studente3 p = new Studente3("Susanna Verdi",1992);
        System.out.println(p);

        //NON-CANONICAL CONSTRUCTOR

        Studente4 s5 = new Studente4(1992);
        System.out.println(s5);
    }

    public static void interfacce(){
        IMyInterface i = new FClass();
        /*--Invoco myMethod implementato in AClass*/
        i.myMethod();
        /*--Disaccoppiamento tra le classi FClass e GClass passando la interface
        * nel costruttore di GClass*/
        GClass g = new GClass(i);
        //IMPLEMENTAZIONI MULTIPLE DI INTERFACE E POLIMORFISMO
        HClass hc = new HClass();
        IClass ic = new IClass();
        IMyInterface1 i1 = new HClass();
        i1.myMethod1();
        //ERRORE DEL COMPILATORE IClass NON IMPLEMENTA IMyInterface1.
        //IMyInterface1 i2 = new IClass();
        IMyInterface2[] i2 = {hc,ic};
        for(IMyInterface2 x: i2){
            x.myMethod2();
        }
        //EREDITARIETA' TRA INTERFACE
        LClass lc = new LClass();
        IMyInterface3 i3 = lc;
        IMyInterface4 i4 = lc;
        i3.myMethod3();
        i4.myMethod3();
        i4.myMethod4();
    }

    public static void LeggiFile(){
        try
        {
             ReadFile.ReadTextFile();
        }
        catch(IOException e){
            System.out.println("Si è verificata la seguente eccezione " + e.getMessage());

        }
    }
    
    public static void Generics(){
        Bottiglia<Acqua> contenuto1 = new Bottiglia<>(new Acqua());
        System.out.println(contenuto1.getContenuto());
        Bottiglia<Vino> contenuto2 = new Bottiglia<>(new Vino());
        System.out.println(contenuto2.getContenuto());
        //METODI GENERICI
        Double d;
        d = MyGenerics.squareRoot(144.0);
        System.out.println("La radice quadrata di 144.0 è " + d.doubleValue());
        d = MyGenerics.squareRoot((int)16);
        System.out.println("La radice quadrata di 16 è " + d.intValue());
        //INTERFACE GENERICHE
        IMyGenericInterface i = new MyGenericClass();
        double x = i.Pow(2.0,3.0).doubleValue();
        System.out.println("La potenza di 2^3 è " + x);
        x = i.Pow(10.0,3.0);
        System.out.println("La potenza di 10^3 è " + (int)x);
        x = i.Pow(3.0,4.0);
        System.out.println("La potenza di 3^4 è " + (byte)x);
    }

    public static void lambda(){
        MyLambdaClass.sortArray();
    }

    public static void thread()
    {
        MyThread t1 = new MyThread();
        t1.start();
        Thread t2 = new Thread(new MyRunnable());
        t2.start();
        try {
            Cliente c1 = new Cliente("Mario", 1200);
            Cliente c2 = new Cliente("Lucia", 50);
            // Avvio i Threads
            c1.start();
            c2.start();

            // Attendo il completamento
            c1.join();
            c2.join();
        }
        catch (InterruptedException e){
            String a = e .getMessage();
            System.out.println(a);
        }
        try {
            /* creiamo 5 istanze dello stesso oggetto */
            ThreadDemo thread1 = new ThreadDemo("Thread-1");
            ThreadDemo thread2 = new ThreadDemo("Thread-2");
            ThreadDemo thread3 = new ThreadDemo("Thread-3");
            ThreadDemo thread4 = new ThreadDemo("Thread-4");
            ThreadDemo thread5 = new ThreadDemo("Thread-5");
            /* avviamo i 5 thread */
            thread1.start();
            thread2.start();
            thread3.start();
            thread4.start();
            thread5.start();
        }
        catch (InterruptedException e){
            String a = e .getMessage();
            System.out.println(a);
        }
        try {
            GetSitePageThread sito1 = new GetSitePageThread("https://www.bing.com");
            GetSitePageThread sito2 = new GetSitePageThread("https://www.google.it");
            // Avvio i Threads
            sito1.start();
            sito2.start();
            // Attendo il completamento
            sito1.join();
            sito2.join();
            // Recupera risultato
            String outSito1 = sito1.getContent();
            String outSito2 = sito2.getContent();
            System.out.println(outSito1);
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println(outSito2);
        }
        catch (InterruptedException e){
            String a = e .getMessage();
            System.out.println(a);
        }
        //LOCK
        ReentrantLockEsempio counter = new ReentrantLockEsempio();
        Contatore c1 = new Contatore(counter, 20, 500);
        Contatore c2 = new Contatore(counter, 20, 500);
        c1.start();
        c2.start();
        //PRODUCER CONSUMER
        List<Integer> bufferCondiviso = new LinkedList<Integer>();
        int size = 4;
        Thread prodThread = new Thread(new Producer(bufferCondiviso, size), "Producer");
        Thread consThread = new Thread(new Consumer(bufferCondiviso, size), "Consumer");
        prodThread.start();
        consThread.start();

    }


}