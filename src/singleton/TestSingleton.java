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
public class TestSingleton 
{
    
    public static void main(String[] Args)
    {
        singleton s1, s2, s3;
        s1 = singleton.getInstance();
        s2 = singleton.getInstance();
        s3 = singleton.getInstance();
        
        Clock c1, c2, c3;
        
        
        
        if(s1 == s3)
        {
            System.out.println("si");
        }
        else
            System.out.println("no");
       
        Clock c, d, e;
        c= Clock.getInstance();
        d= Clock.getInstance();
        e= Clock.getInstance();

        c.getTime();
    }
    
}
