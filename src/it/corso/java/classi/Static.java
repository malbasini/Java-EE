package it.corso.java.classi;

public class Static {
    private static int x;
    private static int y;
    /*Il blocco static viene richiamato solo una volta
     * quando la classe è in memoria. Tipicamente quando
     * vengono costruite istanze.
     */
    static{
        System.out.println("Sono dentro al blocco static");
        x = 10;
        y = 20;
    }
    public void view(){
       System.out.println("Static.x: " + Static.x + " " + "Static.y: " + Static.y);
    }
}
