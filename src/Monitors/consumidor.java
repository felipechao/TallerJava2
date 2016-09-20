/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monitors;

import static java.lang.Thread.sleep;
import java.util.Random;

/**
 *
 * @author Escuela
 */
public class consumidor extends Thread 
{
    protected store Store;

    public consumidor(store Store) 
    {
        this.Store = Store;
    }
    
    
    @Override
    public void run()
    {
        try
        {
        
        while ( true)
        {
            Store.consume();
            Random r = new Random();
            
            sleep(r.nextInt()% 10000+1000);
        }
        }catch(InterruptedException e)
        {
            System.out.println(e.toString());
        }
    } 
    
}
