
package com.dam.practica;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Bayer {

    ArrayList<Medicamento> listado = new ArrayList<>();

    public void añadirMedicamento(String consola, String nombre, String principiosActivos, int unidades, double precio, int tipo,
            int totalUnidadesLote, GregorianCalendar fechaFabricacion, GregorianCalendar fechaCaducidad, ArrayList<Lote> listadoLote) {

        Lote l = new Lote(precio, totalUnidadesLote, fechaFabricacion, fechaCaducidad);

        if (listado.contains(consola)) {
            Medicamento m = (Medicamento) listado.get(listado.indexOf(consola));
            m.listadoLote.add(l);
            m.unidades += l.totalUnidadesLote;
            // hay que saber el  total de  unidades que hay por medicamento 
            //le  sumamos  a unidades (que es el total)  las unidades del lote  añadido

            for (int i = 0; i < m.listadoLote.size(); i++) {//actualizar precio al añadir nuevo lote
                double cambioPrecio = l.precio;
                m.listadoLote.get(i).setPrecio(cambioPrecio);
            }
        } else {
            Medicamento m2 = new Medicamento(nombre, principiosActivos, unidades, tipo);
            listado.add(m2);
            m2.listadoLote.add(l);
            m2.unidades += l.totalUnidadesLote;
            // hay que saber el  total de  unidades que hay por medicamento 
            //le  sumamos  a unidades (que es el total)  las unidades del lote  añadido
        }
    }

    public void busqueda(String busqueda, Medicamento m) {
        int verificar1 = m.nombre.indexOf(busqueda);
        int verificar2 = m.principiosActivos.indexOf(busqueda);
        int contadorEncontrados=0;
        for (int i = 0; i < listado.size(); i++) {
            if (((m.nombre.equalsIgnoreCase(busqueda)) && (verificar1 != -1))||((m.principiosActivos.equals(busqueda)) && (verificar2 != -1))) {
                System.out.println(m);
                contadorEncontrados+=1;
            } 
        }
    }

    public void ventaMedicamento(Medicamento m, String venta, int unidadesVenta, Lote l) {

        int verificar1 = m.nombre.indexOf(venta);
        int verificar2 = m.principiosActivos.indexOf(venta);
        for (int i = 0; i < listado.size(); i++) {
            if (((m.nombre.equalsIgnoreCase(venta)) && (verificar1 != -1)) || ((m.principiosActivos.equals(venta)) || (verificar2 != -1))) {
                if (m.unidades >= unidadesVenta) {
                    int contador = 0;
                    while (contador == unidadesVenta) {
                        for (int j = 0; j < m.listadoLote.size(); j++) {
                            
                            //He puesto las  verificaciones en un solo if  xq  asi ahorramos  un 50% del codigo
                            //int  contador = a las  unidades  vendidas  en  cada  vuelta  del  buckle
                            //el for recorre el  listado de lotes del Medicamento  y el while  controla  que  sean hasta las unidades solicitadas
                            //hay que  ir  sacando unidades del lote empezando desde el primer lote  hasta  que lleguemos  a contador==unidadesVenta
                            //si el primer  lote  tiene solo 5  unidades  y vamos a vender 10  ,  en la primera  vuelta   tenemos que  añadir contador+=5
                            // y  como hemos  vendido el total de  ese lote hacer un remove del mismo
                        }
                    }
                }else {
                    System.out.println("hay unidades de este  medicamento pero no llegan a las solicitadas");
                }
            }else{
                System.out.println("No tenemos ese medicamento en nuestro STOCK");
            }
        }
    }

    public void borradoMedicamento(String borrar, Medicamento m) {
        int borrado1 = m.nombre.indexOf(borrar);
        int borrado2 = m.principiosActivos.indexOf(borrar);
        int  contadorBorrado =0;
        for (int i = 0; i < listado.size(); i++) {
            if (((m.nombre.equalsIgnoreCase(borrar)) && (borrado1 != -1))||((m.principiosActivos.equalsIgnoreCase(borrar)) && (borrado2 != -1))) {
                listado.remove(m);
                contadorBorrado+=1;
            } 
        }
    }
}
