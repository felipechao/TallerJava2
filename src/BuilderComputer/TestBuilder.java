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
public class TestBuilder 
{

    public static void main(String[] args) {
        Director d=new Director();
        d.setBuilder(new DellBuilder());
        d.buildComputadora();
        Computadora miDellBuilder=d.getComputadora();
        System.out.println("el disco duro de mi Dell es:"+ miDellBuilder.getDiscoDuro());
        
     
    }
    
}
