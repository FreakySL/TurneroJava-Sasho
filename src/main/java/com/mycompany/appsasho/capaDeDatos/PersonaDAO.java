/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.appsasho.capaDeDatos;

import com.mycompany.appsasho.clasesJavaAppSasho.Persona;
import java.util.List;

/**
 *
 * @author santi
 */
public interface PersonaDAO {
    
    public void create(Persona a);
    public List<Persona> read();
    public void delete(int codPersona);
    public void update(Persona a);
    
}
