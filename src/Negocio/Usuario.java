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
public class Usuario {
    
    private String atrId;
    private String atrContrasenya;
    private int atrCodigo;
    private String atrNombre;

    public Usuario() {
    }

    public Usuario(String parId, String parContrasenya, int parCodigo, String parNombre) {
        this.atrId = parId;
        this.atrContrasenya = parContrasenya;
        this.atrCodigo = parCodigo;
        this.atrNombre = parNombre;
    }

    /**
     * @return the atrId
     */
    public String getAtrId() {
        return atrId;
    }

    /**
     * @param atrId the atrId to set
     */
    public void setAtrId(String atrId) {
        this.atrId = atrId;
    }

    /**
     * @return the atrContrasenya
     */
    public String getAtrContrasenya() {
        return atrContrasenya;
    }

    /**
     * @param atrContrasenya the atrContrasenya to set
     */
    public void setAtrContrasenya(String atrContrasenya) {
        this.atrContrasenya = atrContrasenya;
    }

    /**
     * @return the atrCodigo
     */
    public int getAtrCodigo() {
        return atrCodigo;
    }

    /**
     * @param atrCodigo the atrCodigo to set
     */
    public void setAtrCodigo(int atrCodigo) {
        this.atrCodigo = atrCodigo;
    }

    /**
     * @return the atrNombre
     */
    public String getAtrNombre() {
        return atrNombre;
    }

    /**
     * @param atrNombre the atrNombre to set
     */
    public void setAtrNombre(String atrNombre) {
        this.atrNombre = atrNombre;
    }
    
    
    
}
