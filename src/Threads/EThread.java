/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Escuela
 */
public class EThread extends Thread 
{
    private int id;

    public EThread(int id) {
        this.id = id;
    }
    
    @Override
    public void run() 
    {
        Random r = new Random();
         System.out.println("Soy el hilo:" + id + " y mi prioridad es: " + this.getPriority());
        try 
        {
            
            System.out.println("Hilo: "+ id + " Esta esperando");
            int tiempo = r.nextInt(29000) + 1000;
            System.out.println("tiempo: "+ tiempo);
            sleep(tiempo);
            System.out.println("Hilo: "+ id + " Finalizo");
        } 
        catch (InterruptedException ex) 
        {
            Logger.getLogger(EThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) throws InterruptedException 
    {
        Thread t100 = new Thread (new Runnable() {
            @Override
            public void run() {
                System.out.println("no soy demonio");
                try 
                {
                    sleep (5000);
                    System.out.println("finaliza");
                    
                }
                catch (InterruptedException ex){
                 }
            }
        }); 
        
        
           t100.start();
        
        (new EThread (2)).start();
        (new EThread (3)).start();
        (new EThread (4)).start();
        Thread t1 = new EThread (1);
        t1.setPriority(MAX_PRIORITY);
        t1.start ();    
        t1.setDaemon(true);
        
        
    }
    
}
