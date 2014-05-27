/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dam.practica;

import java.util.ArrayList;

/**
 *
 * @author DAM1
 */
public class Bayer {
    private ArrayList<Medicamento> listado = new ArrayList<>();
    public boolean añadirMedicamento(String nombre,int precio,int unidades, int fechaFab, int fechaCad,String principioAct, int tipo, int miligramos){
        Medicamento m = new Medicamento(nombre, principioAct, precio, tipo, fechaFab, fechaCad, unidades,miligramos);
        if (listado.contains(m)){
            int aux = listado.indexOf(m);
            return false;
        }
        else listado.add(m); return true;
    }
    
}
