/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garakart;

/**
 *
 * @author gabbo
 */
public class Amico implements Runnable{
    private String nome;
    private boolean tutaCasco;
    private int giri;
    private Semaforo Spo;
    private Semaforo Pis;

    public Amico(String nome, Semaforo S, Semaforo P) {
        this.nome = nome;
        tutaCasco = false;
        giri = 0;
        Spo = S;
        Pis = P;
    }
    
    public void GiroFatto(){
    giri++;
    }
    
    public void FineTurno(){
        giri = 0;
    }

    public String getNome() {
        return nome;
    }

    public boolean isTutaCasco() {
        return tutaCasco;
    }

    public int getGiri() {
        return giri;
    }
    
    @Override
    public void run() {
        Spo.P();
        tutaCasco = true;
        System.out.println(nome+": ha indossato la tuta");
        Spo.V();
        Pis.P();
        System.out.println(nome+": entra in pista");
        for(giri=0;giri<15;giri++){
        System.out.println(nome+": ha completato il giro "+giri);
        }
        System.out.println(nome+": esce dalla pista");
        Pis.V();
        
        Spo.P();
        System.out.println(nome+": si è levato la tuta");
        tutaCasco = false;
        Spo.V();
        System.out.println(nome+": aspetta i suoi amici");
    }
    
}
