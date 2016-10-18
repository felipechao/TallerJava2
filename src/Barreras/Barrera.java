
package Barreras;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Barrera implements Runnable
{
    int id;
    CyclicBarrier b1;
    CyclicBarrier b2;

    public Barrera(int id, CyclicBarrier b1, CyclicBarrier b2) 
    {
        this.id = id;
        this.b1 = b1;
        this.b2 = b2;
    }
    
    
    
    @Override
    public void run() 
    {
        try 
        {
            Random r = new Random();
            System.out.println("Soy el Thread " + id + " Estoy realizando acciones");
            Thread.sleep((long) (r.nextInt(15000) + 15000));
            System.out.println("Soy el Thread " + id + ", Terminé y estoty esprando la barrera 1");
            b1.await();
            System.out.println("Thread " + id + " continuo con mis segundas acciones");
            Thread.sleep((long) (r.nextInt(15000) + 15000 ));
            System.out.println("Soy el Thread " + id + ", Terminé y estoty esprando la barrera 2");
            b2.await();
        }
        
        catch (InterruptedException ex) 
        {
            
        }
        
        catch (BrokenBarrierException ex) 
        {
            
        }
    }
    
};
