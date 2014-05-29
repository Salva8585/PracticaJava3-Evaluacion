/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dam.practica;



import java.util.Date;
import java.util.GregorianCalendar;


/**
 *
 * @author DAM1
 */
public class Lote {

    double precio;
    int tipo, totalUnidadesLote;
    GregorianCalendar fechaFabricacion, fechaCaducidad;

    public Lote(double precio, int tipo, int totalUnidadesLote,GregorianCalendar  fechaFabricacion,GregorianCalendar  fechaCaducidad) {
        this.precio = precio;
        this.tipo = tipo;
        this.totalUnidadesLote = totalUnidadesLote;
        this.fechaFabricacion = fechaFabricacion;
        this.fechaCaducidad = fechaCaducidad;
    }

    public double getPrecio() {
        return precio;
    }

    public int getTipo() {
        return tipo;
    }

    public int getTotalUnidadesLote() {
        return totalUnidadesLote;
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

    public void setTotalUnidadesMedicamento(int totalUnidadesLote) {
        this.totalUnidadesLote = totalUnidadesLote;
    }

    @Override
    public String toString() {
        return "Lote{" + "precio=" + precio + ", tipo=" + tipo + ", totalUnidadesLote=" + totalUnidadesLote + ", fechaFabricacion=" + fechaFabricacion + ", fechaCaducidad=" + fechaCaducidad + '}';
    }
    
    
    
    
}
