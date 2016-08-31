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
public class Idiomas extends AppFactory
{
    private String name;
    private String memoria;
    private int precio;

    public String getName() {
        return name;
    }

    public String getMemoria() {
        return memoria;
    }

    public int getPrecio() {
        return precio;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
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
