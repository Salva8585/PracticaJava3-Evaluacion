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
    String nombre, principioActivo;
    double precio;
    int  tipo,fechaFab,fechaCad,miligramos,unidades;

    public Medicamento(String nombre, String principioActivo, double precio, int tipo, int fechaFab, int fechaCad, int miligramos, int unidades) {
        this.nombre = nombre;
        this.principioActivo = principioActivo;
        this.precio = precio;
        this.tipo = tipo;
        this.fechaFab = fechaFab;
        this.fechaCad = fechaCad;
        this.miligramos = miligramos;
        this.unidades = unidades;
    }
    
    
    
}
