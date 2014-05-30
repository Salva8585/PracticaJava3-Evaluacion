/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dam.practica;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author DAM1
 */
public class Medicamento {

    String nombre, principiosActivos;
    ArrayList<Lote> listadoLote;
    int unidades;

    public Medicamento(String nombre, String principiosActivos,int unidades) {
        this.nombre = nombre;
        this.principiosActivos = principiosActivos;
        this.listadoLote = new ArrayList<>();
        this.unidades = unidades;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrincipiosActivos() {
        return principiosActivos;
    }

    public ArrayList<Lote> getListadoLote() {
        return listadoLote;
    }

    public void setListadoLote(ArrayList<Lote> listadoLote) {
        this.listadoLote = listadoLote;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    

    public boolean equals(Medicamento obj) {
        Medicamento m = (Medicamento) obj;
        return ((m.nombre.equals(nombre)) && (m.principiosActivos.equals(principiosActivos)));

    }
    @Override
    public String toString() {
        return "Medicamento{" + "nombre=" + nombre + ", principiosActivos=" + principiosActivos + ", lote=" + listadoLote + '}';
    }
}
