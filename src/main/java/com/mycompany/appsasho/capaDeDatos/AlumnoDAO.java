/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.appsasho.capaDeDatos;

import com.mycompany.appsasho.clasesJavaAppSasho.Alumno;
import java.util.List;

/**
 *
 * @author santi
 */
public interface AlumnoDAO {
    
    public void create(Alumno a);
    public List<Alumno> read();
    public void delete(int codPersona);
    public void update(Alumno a);
    
}
