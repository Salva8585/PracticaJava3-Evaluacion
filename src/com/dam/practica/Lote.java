/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dam.practica;



import java.util.Date;


/**
 *
 * @author DAM1
 */
public class Lote {

    double precio;
    int tipo, totalUnidadesLote;
    Date fechaFabricacion, fechaCaducidad;

    public Lote(double precio, int tipo, int totalUnidadesLote,Date  fechaFabricacion,Date  fechaCaducidad) {
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

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public Date getFechaCaducidad() {
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
