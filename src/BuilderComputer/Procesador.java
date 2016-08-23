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
public class Procesador 
{
    private String marca;
    private int nucleos;
    private int capacidad;
    private String modelo;

    public String getMarca() {
        return marca;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    /**
     * @return the capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
