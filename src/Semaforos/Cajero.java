/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semaforos;

import static java.lang.Thread.sleep;
import java.util.Random;

/**
 *
 * @author Escuela
 */
public class Cajero 
{
     public void depositar (int cantidad) throws InterruptedException
    {
         
        System.out.println("El unico cajero esta depositando"+ cantidad);
        sleep((long) (Math.random()%10000));
        System.out.println("Termine la operacion depositar");
    }
    
     public void retirar (int cantidad) throws InterruptedException
    {
        System.out.println("El unico cajero esta retirando"+ cantidad);
         sleep((long) (Math.random()%10000));
         System.out.println("Termine de retirar");
    }
    
    public void getSaldo(int cuenta) throws InterruptedException
    {
        Random r = new Random();
        System.out.println("El saldo de la cuenta" + cuenta + "es:" + r.nextInt()%1000 + 1);
         sleep((long) (Math.random()%10000));
         System.out.println("Termine de obtener saldo");
    }
    
    public void pagar (int cuenta, int cantidad) throws InterruptedException
    {
        System.out.println("abonando" + cantidad + " a la cuenta" + cuenta);
        sleep((long) (Math.random()%10000));
         System.out.println("Termine operacion pagar");
    }
}
