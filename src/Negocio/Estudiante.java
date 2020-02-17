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
public class Estudiante extends Usuario{
    
    private int atrFaltas;
    private ArrayList<Materia> atrMaterias;

    public Estudiante() {
        this.atrFaltas = 0;
        this.atrMaterias = new ArrayList<>();
    }

    /**
     * @return the atrFaltas
     */
    public int getAtrFaltas() {
        return atrFaltas;
    }

    /**
     * @param parFaltas the atrFaltas to set
     */
    public void setAtrFaltas(int parFaltas) {
        this.atrFaltas = parFaltas;
    }

    /**
     * @return the atrMaterias
     */
    public ArrayList<Materia> getAtrMaterias() {
        return atrMaterias;
    }

    /**
     * @param parMaterias the atrMaterias to set
     */
    public void setAtrMaterias(Materia parMaterias) {
        this.atrMaterias.add(parMaterias);
    }
    
}
