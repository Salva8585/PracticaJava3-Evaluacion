/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dam.practica;

/**
 *
 * @author DAM1
 */
public class Medicamento {

    String nombre, principiosActivos;

    public Medicamento(String nombre, String principiosActivos) {
        this.nombre = nombre;
        this.principiosActivos = principiosActivos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrincipiosActivos() {
        return principiosActivos;
    }


}
