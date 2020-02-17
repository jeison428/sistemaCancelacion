/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Acceso.Programa;
import Negocio.*;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PeriodoAcademico objPerAca = new PeriodoAcademico("4/02/2020", "4/6/2020");
        
        Programa objPrograma = new Programa("p-001", "Ingesis", "Tulcan", objPerAca);
        Interfaz objInterfaz;
        
        Estudiante objUsuario1 = new Pregrado("4", "es-001", "0123456", 12345, "Juan Giraldo");
        Usuario objUsuario2 = new Posgrado("Seguridad informatica");
        
        Materia objMateria1 = new Materia(100, "Bases de datos", 3);
        Materia objMateria2 = new Materia(101, "POO", 4);
        Materia objMateria3 = new Materia(102, "Calculo 2", 4);
        Materia objMateria4 = new Materia(103, "Mecanica", 3);
        Materia objMateria5 = new Materia(104, "Calculo 3", 4);
        Materia objMateria6 = new Materia(105, "Electromagnetismo", 3);
        Materia objMateria7 = new Materia(106, "Bases de datos 2", 3);
        Materia objMateria8 = new Materia(107, "Estructuras de datos 1", 3);
        Materia objMateria9 = new Materia(108, "Estructuras de datos 2", 4);
        Materia objMateria10 = new Materia(109, "Ondas", 4);
        
        objPrograma.setAtrMaterias(objMateria1);
        objPrograma.setAtrMaterias(objMateria2);
        objPrograma.setAtrMaterias(objMateria3);
        objPrograma.setAtrMaterias(objMateria4);
        objPrograma.setAtrMaterias(objMateria5);
        objPrograma.setAtrMaterias(objMateria6);
        objPrograma.setAtrMaterias(objMateria7);
        objPrograma.setAtrMaterias(objMateria8);
        objPrograma.setAtrMaterias(objMateria9);
        objPrograma.setAtrMaterias(objMateria10);
        
        objUsuario1.setAtrMaterias(objMateria1);
        objUsuario1.setAtrMaterias(objMateria2);
        objUsuario1.setAtrMaterias(objMateria3);
        objUsuario1.setAtrMaterias(objMateria4);
        objUsuario1.setAtrMaterias(objMateria8);
        
        objPrograma.setAtrUsuarios(objUsuario1);
        objPrograma.setAtrUsuarios(objUsuario2);
        
        objInterfaz = new Interfaz(objPrograma);
        objInterfaz.run();
        
    }
    
}
