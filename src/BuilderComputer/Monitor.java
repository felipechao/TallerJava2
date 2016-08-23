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
public class Monitor 
{
    private String marca;
    private int resolucion;
    private String tipo;
    private int pulgadas;

    public String getMarca() {
        return marca;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the pulgadas
     */
    public int getPulgadas() {
        return pulgadas;
    }

    /**
     * @param pulgadas the pulgadas to set
     */
    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }
}
