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
public abstract class App 
{
   private Juegos juegos;
   private Fitness fitness;
   private Idiomas idiomas;
   private Musica musica;

    public Juegos getJuegos() {
        return juegos;
    }

    public Fitness getFitness() {
        return fitness;
    }

    public Idiomas getIdiomas() {
        return idiomas;
    }

    public Musica getMusica() {
        return musica;
    }

    public void setJuegos(Juegos juegos) {
        this.juegos = juegos;
    }

    public void setFitness(Fitness fitness) {
        this.fitness = fitness;
    }

    public void setIdiomas(Idiomas idiomas) {
        this.idiomas = idiomas;
    }

    public void setMusica(Musica musica) {
        this.musica = musica;
    }
    
}
