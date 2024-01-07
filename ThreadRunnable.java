package com.mycompany.minhathreadrunnable;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadRunnable implements Runnable{

    private String nome;
    private int tempo;
    
    public ThreadRunnable(String nome, int tempo){
        this.nome = nome;
        this.tempo = tempo;
        Thread t = new Thread(this);
        t.start();
    }
    
    @Override
    public void run() {
        for (int i=0; i<6;i++){
            System.out.println(nome + " contador " + i);
            try {
                Thread.sleep(tempo);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        
        System.out.println("Terminou a execução!");
    }
    
}
