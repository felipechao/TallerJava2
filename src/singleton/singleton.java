/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Carlos
 */
public class singleton 
{

    private singleton()
    {
        
    }
    
    static singleton getInstance()
    {
      if(singleton1==null)
      {
          singleton1 = new singleton();
      }
          return singleton1;
      
      
    }
    
    private static singleton singleton1;
    
}
