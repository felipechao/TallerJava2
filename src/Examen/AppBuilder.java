/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

/**
 *
 * @author Carlos
 */
public class AppBuilder extends Builder
{

   

    @Override
    void buildJuegos() 
    {
         Juegos juegos = new Juegos();
        juegos.setMemoria(20);
        juegos.setName("Metroid");
        juegos.setTipo("accion");
        app.setJuegos(juegos);
    }

    @Override
    void buildFitness() 
    {
        
    }

    @Override
    void buildIdiomas() 
    {
        
    }

    @Override
    void buildMusica() {
        
    }
    
    
}
