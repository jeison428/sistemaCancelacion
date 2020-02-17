/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso;

import Negocio.*;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Programa {

    private String atrIdProgram;
    private String atrNomProgram;
    private String atrDirProgram;
    private PeriodoAcademico atrPerAcadem;
    private ArrayList<Materia> atrMaterias;
    private ArrayList<Usuario> atrUsuarios;

    public Programa() {
    }

    public Programa(String parIdProgram, String parNomProgram, String parDirProgram, PeriodoAcademico parPerAcadem) {
        this.atrIdProgram = parIdProgram;
        this.atrNomProgram = parNomProgram;
        this.atrDirProgram = parDirProgram;
        this.atrPerAcadem = parPerAcadem;
        this.atrMaterias = new ArrayList();
        this.atrUsuarios = new ArrayList();
    }

    /**
     * @return the atrIdProgram
     */
    public String getAtrIdProgram() {
        return atrIdProgram;
    }

    /**
     * @param parIdProgram the atrIdProgram to set
     */
    public void setAtrIdProgram(String parIdProgram) {
        this.atrIdProgram = parIdProgram;
    }

    /**
     * @return the atrNomProgram
     */
    public String getAtrNomProgram() {
        return atrNomProgram;
    }

    /**
     * @param parNomProgram the atrNomProgram to set
     */
    public void setAtrNomProgram(String parNomProgram) {
        this.atrNomProgram = parNomProgram;
    }

    /**
     * @return the atrDirProgram
     */
    public String getAtrDirProgram() {
        return atrDirProgram;
    }

    /**
     * @param parDirProgram the atrDirProgram to set
     */
    public void setAtrDirProgram(String parDirProgram) {
        this.atrDirProgram = parDirProgram;
    }

    /**
     * @return the atrPerAcadem
     */
    public PeriodoAcademico getAtrPerAcadem() {
        return atrPerAcadem;
    }

    /**
     * @param parPerAcadem the atrPerAcadem to set
     */
    public void setAtrPerAcadem(PeriodoAcademico parPerAcadem) {
        this.atrPerAcadem = parPerAcadem;
    }

    /**
     * @return the atrMaterias
     */
    public ArrayList getAtrMaterias() {
        return atrMaterias;
    }

    /**
     * @param parMaterias the atrMaterias to set
     */
    public void setAtrMaterias(Materia parMaterias) {
        this.atrMaterias.add(parMaterias);
    }

    /**
     * @return the atrUsuarios
     */
    public ArrayList getAtrUsuarios() {
        return atrUsuarios;
    }

    /**
     * @param parUsuarios the atrUsuarios to set
     */
    public void setAtrUsuarios(Usuario parUsuarios) {
        this.atrUsuarios.add(parUsuarios);
    }

    
}
