/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dam.practica;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author DAM1
 */
public class Bayer {

   
    private HashMap<Medicamento,ArrayList<Lote>> tabla = new HashMap<>();
    

    public void añadirMedicamento(String nombre,String principiosActivos,double precio,int  tipo, int totalUnidadesLote,Date fechaFabricacion,Date fechaCaducidad){
         Medicamento  m = new Medicamento(nombre, principiosActivos);
         Lote l=new Lote(precio, tipo, totalUnidadesLote, fechaFabricacion, fechaCaducidad);
          
        if (tabla.containsKey(m)) {
            tabla.get(m).add(l);
        }
        else{
           ArrayList<Lote> Lote = new ArrayList<>();
           tabla.put(m,Lote);   
           tabla.get(m).add(l);
        }
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
