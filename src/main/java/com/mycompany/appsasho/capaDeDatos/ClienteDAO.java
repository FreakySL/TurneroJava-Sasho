/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.appsasho.capaDeDatos;

import com.mycompany.appsasho.clasesJavaAppSasho.Cliente;
import java.util.List;

/**
 *
 * @author santi
 */
public interface ClienteDAO {
    
    public void create(Cliente a);
    public List<Cliente> read();
    public void delete(int codPersona);
    public void update(Cliente a);
    
}
