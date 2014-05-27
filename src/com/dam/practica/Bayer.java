/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dam.practica;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;

/**
 *
 * @author DAM1
 */
public class Bayer {

   
    private HashMap<Medicamento,ArrayList<Lote>> tabla = new HashMap<>();
    

    public void añadirMedicamento(double precio,int  tipo, int totalUnidadesMedicamento,GregorianCalendar fechaFabricacion,GregorianCalendar fechaCaducidad) {
         Lote l = new Lote(precio,tipo,totalUnidadesMedicamento,fechaFabricacion, fechaCaducidad);
         ArrayList<Medicamento> tabla = new ArrayList<>();
         
        //  if (tabla.containsKey(l))   SI EXISTE ANADIR LOTE
        // else SINO EXISTE  DAS DE ALTA UN NUEVO MEDICAMENTO
       // RECORDAR HAY QUE SUMAR EL NUMERO DE UNIDADES AL TOTAL
    }

    public boolean busqueda(Medicamento m) {
        return true;
    }

    public void ventaMedicamento(Medicamento m) {
    }

    public boolean borradoMedicamento(String nombre) {
        return true;
    }
}
