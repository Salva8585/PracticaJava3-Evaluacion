/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dam.practica;

import java.util.GregorianCalendar;

/**
 *
 * @author DAM1
 */
public class Lote {

    double precio;
    int tipo, totalUnidadesMedicamento;
    GregorianCalendar fechaFabricacion, fechaCaducidad;

    public Lote(double precio, int tipo, int totalUnidadesMedicamento, GregorianCalendar fechaFabricacion, GregorianCalendar fechaCaducidad) {
        this.precio = precio;
        this.tipo = tipo;
        this.totalUnidadesMedicamento = totalUnidadesMedicamento;
        this.fechaFabricacion = fechaFabricacion;
        this.fechaCaducidad = fechaCaducidad;
    }

    public double getPrecio() {
        return precio;
    }

    public int getTipo() {
        return tipo;
    }

    public int getTotalUnidadesMedicamento() {
        return totalUnidadesMedicamento;
    }

    public GregorianCalendar getFechaFabricacion() {
        return fechaFabricacion;
    }

    public GregorianCalendar getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setTotalUnidadesMedicamento(int totalUnidadesMedicamento) {
        this.totalUnidadesMedicamento = totalUnidadesMedicamento;
    }
    
}
