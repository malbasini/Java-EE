package it.corso.java.variabili;

public class TestVariabili {

    protected String nome = "Marco";
    /* Variabile di istanza. Vediamo con un esempio
     * perchè viene chiamata variabile di istanza,
     * guardando il metodo VariabileIstanza().
     */


    /* Variabile di classe. Tale variabile non appartiene ad una
     * specifica istanza, ma appartiene alla classe stessa. Questo
     * perchè abbiamo usato il modificatore static. Si possono avere
     * sia variabili che metodi statici (appartenenti alla classe
     * e non alle istanze).
     */
    public static int myNumber = 100;

    public void myMethod()
    {
        int a = 100;/*Variabile locale
        viene creata quando viene invocato il metodo,
        e distrutta quando la variabile esce dal suo
        ambito di visibilità, ossia quando il metodo
        termina. */
        System.out.println(a);
        System.out.println("myNumber vale: " + TestVariabili.myNumber);
    }
    public void variabileIstanza(){
        /*Creiamo un oggetto di tipo TestVariabili o
         * più precisamente ne creiamo due istanze. La OOP sarà
         * spiegata approfonditamente più avanti nel corso, per
         * ora ti basta sapere che una classe è un pò come un prototipo
         * da cui vengono creati oggetti, detti appunto istanze della
         * classe. L'oggetto viene creato attraverso l'operatore new
         * che alloca la memoria necessaria per contenere la struttura
         * dati della classe.     
         *  */
        TestVariabili t1 = new TestVariabili();
        t1.nome = "Anna";//Variabile nome di istanza t1
        TestVariabili t2 = new TestVariabili();
        t2.nome = "Luca";//Variabile nome di istanza t2
        System.out.println("Nome istanza t1:" + t1.nome);
        System.out.println("Nome istanza t2:" + t2.nome);
        /*OGNI ISTANZA MANTIENE LA PROPRIA COPIA DI VARIABILI */

    }
    public void testParametri(String nome, String cognome, int anni){
        System.out.println("Persona: " + nome + " " + cognome + " anni " + anni );
    }
}
