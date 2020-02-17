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
public class PeriodoAcademico {
    private String atrFechaIn;
    private String atrFechaFin;
    private String atrObservaciones;

    public PeriodoAcademico() {
    }

    public PeriodoAcademico(String parFechaIn, String parFechaFin) {
        this.atrFechaIn = parFechaIn;
        this.atrFechaFin = parFechaFin;
    }

    /**
     * @return the atrFechaIn
     */
    public String getAtrFechaIn() {
        return atrFechaIn;
    }

    /**
     * @param parFechaIn the atrFechaIn to set
     */
    public void setAtrFechaIn(String parFechaIn) {
        this.atrFechaIn = parFechaIn;
    }

    /**
     * @return the atrFechaFin
     */
    public String getAtrFechaFin() {
        return atrFechaFin;
    }

    /**
     * @param parFechaFin the atrFechaFin to set
     */
    public void setAtrFechaFin(String parFechaFin) {
        this.atrFechaFin = parFechaFin;
    }

    /**
     * @return the atrObservaciones
     */
    public String getAtrObservaciones() {
        return atrObservaciones;
    }

    /**
     * @param parObservaciones the atrObservaciones to set
     */
    public void setAtrObservaciones(String parObservaciones) {
        this.atrObservaciones = parObservaciones;
    }
    
    
}
