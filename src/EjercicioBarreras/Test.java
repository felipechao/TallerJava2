
package EjercicioBarreras;

import java.util.concurrent.CyclicBarrier;


public class Test 
{
    public static void main(String[] args) 
    {
        int [] arregloResultados;
        arregloResultados = new int [4];
        Accion a = new Accion(arregloResultados); 
        CyclicBarrier c = new CyclicBarrier(4, a);
    }

    private static class Accion implements Runnable
    {
        int[]arreglo;
        public Accion() 
        {
            
            
        }

        public Accion(int[] arreglo) 
        {
            this.arreglo = arreglo;
        }

        @Override
        public void run() 
        {
            System.out.println("El numero primo mmaximo menor a 10,000 " + arreglo [0]);
            System.out.println("El numero natural perfecto que es igual a 100,000 ");
            System.out.println("La usma de pares entre 1 y 10000 es " + arreglo[2]);
            System.out.println("El numero aleatorio entre 100,000 y 1 000 000" + arreglo[3]);
        }
    }
}
