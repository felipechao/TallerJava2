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
public class Juegos extends AppFactory
{
    private String name;
    private int memoria;
    private String tipo;

    public void setName(String name) {
        this.name = name;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getName() {
        return name;
    }

    public int getMemoria() {
        return memoria;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    protected void concepcion() {
    }

    @Override
    protected void diseño() {
    }

    @Override
    protected void planificacion() {
    }

    @Override
    protected void produccion() {
    }

    @Override
    protected void pruebas() {
    }
}
