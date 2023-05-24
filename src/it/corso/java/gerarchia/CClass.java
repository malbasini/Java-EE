package it.corso.java.gerarchia;

public class CClass extends BClass {
    /*
     * Questo è solo un esempio, non si devono mai esporre
     * all'esterno della classe gli attributi che devono rimanere private
    */
    public String s;

    public CClass(String a, String b, String c) {
        /* CClass deve inizializzare sia AClass che BClass */
        super(a,b);
        this.s = c;
    }
    
}
