package it.corso.java.thread.syncronized;
public class Cliente extends Thread {
    private double sommaDaPrelevare;
    public Cliente(String nomeCliente, double sommaDaPrelevare) {
        super();
        this.setName(nomeCliente);
        this.sommaDaPrelevare = sommaDaPrelevare;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " arriva al bancomat");
        System.out.println("Quando arriva " + Thread.currentThread().getName() + " il saldo è: " + ContoCorrente.getInstance().getSaldo());
        System.out.println("La somma che vuole prelevare " + Thread.currentThread().getName() + " : " + sommaDaPrelevare);
        try {
            ContoCorrente.getInstance().prelievo(sommaDaPrelevare);
            System.out.println(Thread.currentThread().getName() + " TUTTO OK PRELIEVO EFFETTUATO");
        } catch (Exception e) {
            System.out.println(Thread.currentThread().getName() + "NON HAI SOLDI!!!");
            String a = e.getMessage();
            System.out.println(a);
        }
    }
}
