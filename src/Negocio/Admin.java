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
public class Admin extends Usuario{
    
    private String atrRol;

    public Admin() {
    }

    public Admin(String parRol) {
        this.atrRol = parRol;
    }

    /**
     * @return the atrRol
     */
    public String getAtrRol() {
        return atrRol;
    }

    /**
     * @param atrRol the atrRol to set
     */
    public void setAtrRol(String atrRol) {
        this.atrRol = atrRol;
    }
    
    
}
