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
public class Pregrado extends Estudiante{
    
    private String atrSemestre;

    public Pregrado() {
    }

    public Pregrado(String parSemestre) {
        this.atrSemestre = parSemestre;
    }

    /**
     * @return the atrSemestre
     */
    public String getAtrSemestre() {
        return atrSemestre;
    }

    /**
     * @param parSemestre the atrSemestre to set
     */
    public void setAtrSemestre(String parSemestre) {
        this.atrSemestre = parSemestre;
    }
    
}
