/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appsasho.clasesJavaAppSasho;

/**
 *
 * @author santi
 */
public class Profesor extends Persona {
    
    private String profesion;
    
    public Profesor(String nombre, String apellido, int edad, String domicilio, int telefono) {
        super(nombre, apellido, edad, domicilio, telefono);
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
}
