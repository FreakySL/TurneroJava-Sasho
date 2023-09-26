/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appsasho.clasesJavaAppSasho;

/**
 *
 * @author santi
 */
public class Turno {
    
    private int tipoServicio;
    private float costo;

    public Turno(int tipoServicio, float costo) {
        this.tipoServicio = tipoServicio;
        this.costo = costo;
    }

    public int getTipoServicio() {
        return tipoServicio;
    }

    public float getCosto() {
        return costo;
    }

    public void setTipoServicio(int tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
    
    
    
}
