/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dam.practica;



import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;


/**
 *
 * @author DAM1
 */
public class Lote implements Comparable<Lote> {

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

    @Override
    public int compareTo(Lote o) {
        long milis1 = this.fechaCaducidad.getTimeInMillis();
        long milis2 = o.fechaCaducidad.getTimeInMillis();
        if (milis1 > milis2)    return  1;
        else if (milis1>milis2)    return  -1;
        else return 0;  
                              
        //To change body of generated methods, choose Tools | Templates.
        // hay que  hacer un compare  tu que  organice de mas  cercana  a menos  cercana  la  fecha de caducidad 
        //con la  fecha del sistema
        
        
    }

}
