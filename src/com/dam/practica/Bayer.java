
package com.dam.practica;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Bayer {

    ArrayList<Medicamento> listado = new ArrayList<>();

    public void aÃ±adirMedicamento(Medicamento m, Lote l, String consola,boolean control) {

       
        if (listado.contains(consola)) {
            control=true;
            m.listadoLote.add(l);
            m.unidades += l.totalUnidadesLote;

            for (int i = 0; i < m.listadoLote.size(); i++) {
                double cambioPrecio = l.precio;
                m.listadoLote.get(i).setPrecio(cambioPrecio);
            }
        } else {
            control=false;
            listado.add(m);
            m.listadoLote.add(l);
            m.unidades += l.totalUnidadesLote;

        }
    }

    public void busqueda(String busqueda, Medicamento m) {
        int verificar1 = m.nombre.indexOf(busqueda);
        int verificar2 = m.principiosActivos.indexOf(busqueda);
        int contadorEncontrados = 0;
        for (int i = 0; i < listado.size(); i++) {
            if (((m.nombre.equalsIgnoreCase(busqueda)) && (verificar1 != -1)) || ((m.principiosActivos.equals(busqueda)) && (verificar2 != -1))) {
                System.out.println(m);
                contadorEncontrados += 1;
            }
        }
    }

    public void ventaMedicamento( String venta, int unidadesVenta) {

        int verificar1 = listado.indexOf(venta);
        int verificar2 = listado.indexOf(venta);
        for (int i = 0; i < listado.size(); i++) {
            if(((listado.get(i).nombre.equalsIgnoreCase(venta))&& (verificar1 != -1))||((listado.get(i).principiosActivos.equalsIgnoreCase(venta))&& (verificar1 != -1))) {
                if (listado.get(i).unidades >= unidadesVenta) {
                    int contador = 0;
                    while (contador != unidadesVenta) {
                        for (int j = 0; j < listado.get(i).listadoLote.size();) {
                            //He puesto las  verificaciones en un solo if  xq  asi ahorramos  un 50% del codigo
                            //int  contador = a las  unidades  vendidas  en  cada  vuelta  del  buckle
                            //el for recorre el  listado de lotes del Medicamento  y el while  controla  que  sean hasta las unidades solicitadas
                            //hay que  ir  sacando unidades del lote empezando desde el primer lote  hasta  que lleguemos  a contador==unidadesVenta
                            //si el primer  lote  tiene solo 5  unidades  y vamos a vender 10  ,  en la primera  vuelta   tenemos que  aÃ±adir contador+=5
                            // y  como hemos  vendido el total de  ese lote hacer un remove del mismo
                        }
                    }
                } else {
                    System.out.println("hay unidades de este  medicamento pero no llegan a las solicitadas");
                }
            } else {
                System.out.println("No tenemos ese medicamento en nuestro STOCK");
            }
        }
    }

    public void borradoMedicamento(String borrar, Medicamento m) {
        int borrado1 = m.nombre.indexOf(borrar);
        int borrado2 = m.principiosActivos.indexOf(borrar);
        int contadorBorrado = 0;
        for (int i = 0; i < listado.size(); i++) {
            if (((m.nombre.equalsIgnoreCase(borrar)) && (borrado1 != -1)) || ((m.principiosActivos.equalsIgnoreCase(borrar)) && (borrado2 != -1))) {
                listado.remove(m);
                contadorBorrado += 1;
            }
        }
    }
    public void caducidad(GregorianCalendar fechaSistem, ArrayList<Medicamento> listado ){
        
        for (int i = 0; i < listado.size(); i++) {
            for (int j = 0; j < listado.get(i).listadoLote.size(); j++) {
                if(listado.get(i).listadoLote.get(j).fechaCaducidad.getTimeInMillis() < fechaSistem.getTimeInMillis()){
                    listado.get(i).listadoLote.get(j);
                  //falta  el remove
                }
            }    
        }       
    }
}
