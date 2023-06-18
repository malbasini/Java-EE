package it.corso.java.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyLambdaClass {
    public static void sortArray() {
        List<Integer> numbers = Arrays.asList(3, 2, 1, 4, 5);
        /*compareTo è l'unico metodo definito nella interface Comparable.
        * Arrays.asList restituisce gli elementi di un array sottoforma
        * di List<Integer>*/
        Collections.sort(numbers, (Integer o1, Integer o2) -> o1.compareTo(o2));
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
