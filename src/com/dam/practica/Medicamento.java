

package com.dam.practica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;


public class Medicamento implements Serializable{

    private String nombre, principiosActivos;
    private ArrayList<Lote> listadoLote;
    private int unidades,tipo;

    public Medicamento(String nombre, String principiosActivos,int unidades,int tipo) {
        this.nombre = nombre;
        this.principiosActivos = principiosActivos;
        this.listadoLote = new ArrayList<>();
        this.unidades = unidades;
        this.tipo=tipo;
    }

    public Medicamento(String nombre, String principiosActivos) {//constructor de busqueda
        this.nombre = nombre;
        this.principiosActivos = principiosActivos;
    }
    
//    public Medicamento (String valor, boolean estado) {
//        if (estado) nombre = valor;
//        else principiosActivos = valor;
//    }

    
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

    public int getTipo() {
        return tipo;
    }
    
    @Override
    public boolean equals(Object obj) {
 
        Medicamento m = (Medicamento) obj;
        if (nombre == null) {
            if(principiosActivos.contains(principiosActivos)) return true;
            else return false;
        }
        else {
            if(nombre.contains(nombre)) return true;
            else return false;
        }
    }
    @Override
    public String toString() {
        return "Medicamento{" + "nombre=" + nombre + ", principiosActivos=" + principiosActivos + ", lote=" + listadoLote +", tipo=" + tipo + '}';
    }
}
