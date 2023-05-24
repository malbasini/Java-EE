package it.corso.java.ereditarieta;

public class BClass extends AClass {
    /* Nasconde l'attributo stringa nella superclasse. 
     * Questo è solo un esempio, non si devono mai esporre
     * all'esterno della classe gli attributi.
    */
    public String stringa;
    public BClass() {
        super();
        super.stringa = "Superclasse modificata";
        this.stringa = "Sottoclasse";
    }
}
