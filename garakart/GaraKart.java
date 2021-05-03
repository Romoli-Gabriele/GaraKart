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
public class GaraKart {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Semaforo P = new Semaforo(4);
        Semaforo S = new Semaforo(2);
        
        Amico a1 = new Amico("A1", S, P);
        Amico a2 = new Amico("A2", S, P);
        Amico a3 = new Amico("A3", S, P);
        Amico a4 = new Amico("A4", S, P);
        Amico a5 = new Amico("A5", S, P);
        Amico a6 = new Amico("A6", S, P);
        Amico a7 = new Amico("A7", S, P);
        Amico a8 = new Amico("A8", S, P);
        
        Thread t1 = new Thread(a1);
        Thread t2 = new Thread(a2);
        Thread t3 = new Thread(a3);
        Thread t4 = new Thread(a4);
        Thread t5 = new Thread(a5);
        Thread t6 = new Thread(a6);
        Thread t7 = new Thread(a7);
        Thread t8 = new Thread(a8);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
    }

   
}
