/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dam.practica;


import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;


/**
 *
 * @author DAM1
 */
public class Bayer {

   
    ArrayList<Medicamento> listado=new ArrayList<>();
    

    public void añadirMedicamento(String nombre,String principiosActivos,double precio,int  tipo, int totalUnidadesLote, GregorianCalendar fechaFabricacion,GregorianCalendar fechaCaducidad, ArrayList<Lote> listadoLote){
         Medicamento  m = new Medicamento(nombre, principiosActivos);
         Lote l=new Lote(precio, tipo, totalUnidadesLote, fechaFabricacion, fechaCaducidad);
         
        if (listado.contains(m)) {
            m.setListadoLote(m.listadoLote);
        }
        else{
           listado.add(m);
           m.setListadoLote(m.listadoLote);
        }
    }

    public void busqueda(Medicamento m) {     
    }

    public void ventaMedicamento(Medicamento m) {
    }

    public boolean borradoMedicamento(String nombre) {
        return true;
    }
}
