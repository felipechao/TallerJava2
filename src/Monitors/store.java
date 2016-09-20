/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monitors;

import java.util.Random;
import java.util.Vector;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author Escuela
 */
public class store 
{
    Lock lock;
    Condition isFull;
    Condition isEmpty;
    Vector<Integer> v;
    int count = 0;
    public store()
    {
        lock = new ReentrantLock ();
        isFull = lock.newCondition();
        isEmpty = lock.newCondition();
        
        v = new Vector<Integer>();
        v.setSize(10);
        
    }
    
    public void produce()
    {
        lock.lock();
        try
        {
            while(count == 10)
        {
            isFull.await();
        }
            Random r = new Random();
            Integer temp = new Integer (r.nextInt() &100);
            v.add(temp);
            System.out.println("Se produjo un: " + temp.toString());
            count ++;
            isEmpty.signal();
            
        }catch (InterruptedException e)
        {
            System.out.println(e.toString());
        }
        finally 
        {
            lock.unlock();
        }
        
        
        
    }
    
    public Integer consumir()
    {
        Integer temp = 0;
        lock.lock();
        try
        {
            while(count == 0)
            {
                isEmpty.await();
            }
             temp = v.lastElement();
             System.out.println("Consumidor consumio un: " + temp);
            v.remove(count);
            count --;
            isFull.signal();
            
        }catch (InterruptedException e)
        {
            System.out.println(e.toString());
        }
        
        finally
        {
            lock.unlock();
            return temp;
        }
        
        
        
    }

    void consume() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
