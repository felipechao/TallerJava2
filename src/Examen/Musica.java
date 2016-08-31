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
public class Musica extends AppFactory
{
    private String name;
    private int memoria;
    private String genero;

    public void setName(String name) {
        this.name = name;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getName() {
        return name;
    }

    public int getMemoria() {
        return memoria;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    protected void concepcion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void diseño() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void planificacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void produccion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void pruebas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
