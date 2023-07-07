package it.corso.java.liste;
import java.util.*;

public class MyArrayList {

    public static void myTestMethodArrayList(){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        String ele = cars.get(0);
        System.out.println(ele);
        cars.set(0,"Fiat");
        //ITERAZIONE CON UN CICLO FOR
        for(String s : cars)
            System.out.println(s);
        System.out.println("La dimensione di cars é: " + cars.size());
        int posizione = cars.indexOf("Mazda");
        System.out.println(posizione);
        //ITERAZIONE CON L'INTERFACCIA ITERATOR
        Iterator<String> iterator = cars.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());
    }
}
