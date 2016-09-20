/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monitors;

import java.util.Random;

/**
 *
 * @author Escuela
 */
public class productor extends Thread 
{
    protected store Store;

   
    
     
    productor(store Store) {
        
     this.Store = Store;
    }
    
    @Override
    public void run()
    {
        try
        {
        
        while ( true)
        {
            Store.produce();
            Random r = new Random();
            int temp = r.nextInt()% 20000+19000;
            sleep(temp>=0? temp : (temp*-1));
        }
        }catch(InterruptedException e)
        {
            System.out.println(e.toString());
        }
    }
}
