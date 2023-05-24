package it.corso.java.gerarchia;

public class BClass extends AClass {
    /*
     * Questo è solo un esempio, non si devono mai esporre
     * all'esterno della classe gli attributi che devono rimanere private
    */
    public String str;

    public BClass(String a, String b) {
        super(a);
        this.str = b;
    }
    
}
