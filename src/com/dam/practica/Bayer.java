/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dam.practica;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author DAM1
 */
public class Bayer {

    ArrayList<Medicamento> listado = new ArrayList<>();

    public void añadirMedicamento(String consola, String nombre, String principiosActivos,int unidades, double precio, int tipo,
            int totalUnidadesLote, GregorianCalendar fechaFabricacion, GregorianCalendar fechaCaducidad, ArrayList<Lote> listadoLote) {

        Lote l = new Lote(precio, tipo, totalUnidadesLote, fechaFabricacion, fechaCaducidad);

        if (listado.contains(consola)) {
            Medicamento m = (Medicamento) listado.get(listado.indexOf(consola));
            m.listadoLote.add(l);
            m.unidades+l.totalUnidadesLote;
            // hay que saber el  total de  unidades que hay por medicamento 
            //le  sumamos  a unidades (que es el total)  las unidades del lote  añadido

            for (int i = 0; i < m.listadoLote.size(); i++) {
                double cambioPrecio = l.precio;
                m.listadoLote.get(i).setPrecio(cambioPrecio);
            }
        } else {
            Medicamento m2 = new Medicamento(nombre, principiosActivos, unidades);
            listado.add(m2);
            m2.listadoLote.add(l);
             m.unidades+l.totalUnidadesLote;
            // hay que saber el  total de  unidades que hay por medicamento 
            //le  sumamos  a unidades (que es el total)  las unidades del lote  añadido
        }
    }

    public void busqueda(String busqueda, Medicamento m) {
        int verificar1 = m.nombre.indexOf(busqueda);
        int verificar2 = m.principiosActivos.indexOf(busqueda);
        for (int i = 0; i < listado.size(); i++) {
            if ((m.nombre.equalsIgnoreCase(busqueda)) || (verificar1 != -1)) {
                System.out.println(m);
            } else if ((m.principiosActivos.equals(busqueda)) || (verificar2 != -1)) {
                System.out.println(m);
            }
        }
    }

    public void ventaMedicamento(Medicamento m) {
    }

    public boolean borradoMedicamento(String borrar, Medicamento m) {
        int borrado1 = m.nombre.indexOf(borrar);
        int borrado2 = m.principiosActivos.indexOf(borrar);
        for (int i = 0; i < listado.size(); i++) {
            if ((m.nombre.equalsIgnoreCase(borrar)) || (borrado1 != -1)) {
                listado.remove(m);
            } else if ((m.principiosActivos.equalsIgnoreCase(borrar)) || (borrado2 != -1)) {
                listado.remove(m);
            }
        }
        return true;
    }
}
