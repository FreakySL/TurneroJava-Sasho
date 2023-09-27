/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appsasho.clasesJavaAppSasho;

/**
 *
 * @author santi
 */
public class Alumno extends Persona{
    
    private String email;
    
    public Alumno(String nombre, String apellido, int edad, String domicilio, int telefono) {
        super(nombre, apellido, edad, domicilio, telefono);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
