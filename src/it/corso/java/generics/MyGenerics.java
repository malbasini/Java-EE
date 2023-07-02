
package it.corso.java.generics;
@SuppressWarnings("unused")
public class MyGenerics<T extends Number> {
    private T t;
    public MyGenerics(T t){
        this.t = t;

    }
    public static <T extends Number> double squareRoot(T t){
        return Math.sqrt(t.doubleValue());
    }
}
