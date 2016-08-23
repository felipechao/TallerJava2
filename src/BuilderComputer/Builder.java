/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderComputer;

/**
 *
 * @author Carlos
 */
public abstract class Builder    
{

    protected Computadora computadora;
    
      public void createComputadora()
      {
          computadora=new Computadora();
      }
      
      
      public Computadora getComputadora() {
        return computadora;
    }
      
      abstract void buildDisco();
      abstract void buildRam();
      abstract void buildMonitor();
      abstract void buildProcesador();
      abstract void buildTeclado();

        
 
    
}
