/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author usuario
 */
public class Posgrado extends Estudiante{
    
    private String atrEspecializacion;

    public Posgrado() {
    }

    public Posgrado(String parEspecializacion) {
        this.atrEspecializacion = parEspecializacion;
    }

    public void setAtrEspecializacion(String parEspecializacion) {
        this.atrEspecializacion = parEspecializacion;
    }

    public String getAtrEspecializacion() {
        return atrEspecializacion;
    }
    
}
