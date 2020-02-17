/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

/**
 *
 * @author usuario
 */
public class Acceso {
    
    private int atrId;
    private String atrPass;
    private String atrProgram;

    public Acceso() {
    }
    
    public Acceso(int parId, String parPass, String parProgram) {
        this.atrId = parId;
        this.atrPass = parPass;
        this.atrProgram = parProgram;
    }

    public void setAtrId(int parId) {
        this.atrId = parId;
    }

    public void setAtrPass(String parPass) {
        this.atrPass = parPass;
    }

    public void setAtrProgram(String parProgram) {
        this.atrProgram = parProgram;
    }

    public int getAtrId() {
        return atrId;
    }

    public String getAtrPass() {
        return atrPass;
    }

    public String getAtrProgram() {
        return atrProgram;
    }
    
    public void validarInfo(){
    
    }
    
}
