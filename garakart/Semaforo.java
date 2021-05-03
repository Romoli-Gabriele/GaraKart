/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garakart;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabbo
 */
public class Semaforo {
    int v;

    public Semaforo(int v) {
        this.v = v;
    }
    
    synchronized public void P(){
        while (v == 0){
            
            try {
                wait();
            } catch (InterruptedException e) {
                }
        }
        v--;
    }
    
    synchronized public void V(){
        v++;
        notify();
    }
    
}
