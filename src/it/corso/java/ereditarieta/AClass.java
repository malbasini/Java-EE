package it.corso.java.ereditarieta;

public class AClass {
    protected String stringa;
    protected boolean bool;

    public AClass() {
        this.stringa = "Superclasse";
        this.bool = true;
    }

    public void view(){
        System.out.println(this.stringa + " " + this.bool);
    }
}
