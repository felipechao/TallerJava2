/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author Escuela
 */
public class Calculadora {
        public <T extends Number> T sum (T a, T b)
        {
    if (a.getClass().equals(Integer.class))
        return (T) new Integer( a.intValue() + b.intValue());
    if (a.getClass().equals(Double.class))
        return (T) new Double( a.intValue() + b.doubleValue());
    if (a.getClass().equals(Float.class))
        return (T) new Float( a.intValue() + b.floatValue());
    
    return null;
        }
        
        public static void main(String[] args) {
        Calculadora c = new Calculadora();
        
            System.out.println("la suma es:" + c.sum(5.5f,5.5f));
            
        }
        
            
        public <T extends Number> T res(T c, T d)
        {
    if (c.getClass().equals(Integer.class))
        return (T) new Integer( c.intValue() - d.intValue());
    if (c.getClass().equals(Double.class))
        return (T) new Double( c.intValue() - d.doubleValue());
    if (c.getClass().equals(Float.class))
        return (T) new Float( c.intValue() - d.floatValue());
    
    return null;
        }
        
        public static void main(String[] args) {
        Calculadora c = new Calculadora();
    }
}