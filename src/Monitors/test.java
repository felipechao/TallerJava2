/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monitors;

/**
 *
 * @author Escuela
 */
public class test 
{
    public static void main(String[] args) 
    {
        store Store = new store();
        productor [] p = new productor [10];
        Thread [] c = new consumidor [10];
        for (int i = 0; i < 10; i++) 
        {
            p[i] = new productor ( Store);
            c [i] = new consumidor (Store);
            p[i].start();
            c[i].start();
        }
    }
}
