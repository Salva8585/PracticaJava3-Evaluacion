
package com.dam.practica;

import java.util.ArrayList;
import java.util.Objects;


public class Medicamento {

    String nombre, principiosActivos;
    ArrayList<Lote> listadoLote;
    int unidades,tipo;

    public Medicamento(String nombre, String principiosActivos,int unidades,int tipo) {
        this.nombre = nombre;
        this.principiosActivos = principiosActivos;
        this.listadoLote = new ArrayList<>();
        this.unidades = unidades;
        this.tipo=tipo;
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

    public int getTipo() {
        return tipo;
    }
    
    

    public boolean equals(Medicamento obj) {
        Medicamento m = (Medicamento) obj;
        return ((m.nombre.equals(nombre)) && (m.principiosActivos.equals(principiosActivos)));

    }
    @Override
    public String toString() {
        return "Medicamento{" + "nombre=" + nombre + ", principiosActivos=" + principiosActivos + ", lote=" + listadoLote +", tipo=" + tipo + '}';
    }
}
