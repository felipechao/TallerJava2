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
public class Fitness extends AppFactory
{
    private String names;
    private int memoria;
    private String temporal;

    public void setNames(String names) {
        this.names = names;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public void setTemporal(String temporal) {
        this.temporal = temporal;
    }

    public String getNames() {
        return names;
    }

    public int getMemoria() {
        return memoria;
    }

    public String getTemporal() {
        return temporal;
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
