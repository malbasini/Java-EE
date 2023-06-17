package it.corso.java.generics;

public class MyGenericClass<T1,T2 extends Number> implements IMyGenericInterface<T1,T2> {
        public Double Pow(T1 t1, T2 t2){
            //t1 è la base t2 è l'esponente
            return Math.pow((Double) t1,(Double)t2);
        }
}
