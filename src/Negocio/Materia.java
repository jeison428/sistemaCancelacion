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
public class Materia {
    
    private int atrCodigoMateria;
    private String atrNombre;
    private int atrCreditos;

    public Materia() {
    }

    public Materia(int parCodigomateria, String parNombre, int parCreditos) {
        this.atrCodigoMateria = parCodigomateria;
        this.atrNombre = parNombre;
        this.atrCreditos = parCreditos;
    }
    
    public int getAtrCodigoMateria() {
        return atrCodigoMateria;
    }

    public String getAtrNombre() {
        return atrNombre;
    }

    public int getAtrCreditos() {
        return atrCreditos;
    }

    public void setAtrCodigoMateria(int parCodigoMateria) {
        this.atrCodigoMateria = parCodigoMateria;
    }

    public void setAtrNombre(String parNombre) {
        this.atrNombre = parNombre;
    }

    public void setAtrCreditos(int parCreditos) {
        this.atrCreditos = parCreditos;
    }

}
