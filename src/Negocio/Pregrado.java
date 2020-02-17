/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Pregrado extends Estudiante{
    
    private String atrSemestre;

    public Pregrado() {
        super();
    }

    public Pregrado(String parSemestre,String parId, String parContrasenya, int parCodigo, String parNombre) {
        super(parId, parContrasenya, parCodigo, parNombre);
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
    
    /**
     * @param parMateria the atrMaterias to set
     */
    @Override
    public void setAtrMaterias(Materia parMateria) {
        this.atrMaterias.add(parMateria);
    }
    
    @Override
    public ArrayList<Materia> getAtrMaterias() {
        return this.atrMaterias;
    }
    
}
