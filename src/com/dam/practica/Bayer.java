package com.dam.practica;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Bayer {

    ArrayList<Medicamento> listado = new ArrayList<>();

    public void añadirMedicamento(Medicamento m, Lote l, String consola, int control) {
        control=0;
        for (int i = 0; i <=listado.size(); i++) {

            if (listado.get(i).getNombre().contains(consola)) {
                control = 1;
                listado.get(i).listadoLote.add(l);
                listado.get(i).setUnidades(listado.get(i).getUnidades()+l.getTotalUnidadesLote());

                for (int j = 0; j <= m.listadoLote.size(); j++) {
                    double cambioPrecio = l.getPrecio();
                    listado.get(i).listadoLote.get(j).setPrecio(cambioPrecio);
                }
            } else {
                control = 2;
                listado.add(m);
                m.listadoLote.add(l);
                m.setUnidades(m.getUnidades()+l.getTotalUnidadesLote());

            }
        }
    }

    public void busqueda(String busqueda) {

        int contadorEncontrados = 0;
        for (int i = 0; i < listado.size(); i++) {
            if (((listado.get(i).getNombre().equalsIgnoreCase(busqueda)) && (listado.get(i).getNombre().indexOf(busqueda) != -1)) || ((listado.get(i).getPrincipiosActivos().equalsIgnoreCase(busqueda)) && (listado.get(i).getPrincipiosActivos().indexOf(busqueda) != -1))) {
                System.out.println(listado.get(i).getNombre());
                contadorEncontrados += 1;
            }
        }
        System.out.println("-Encontrados = " + contadorEncontrados);
    }

    public void ventaMedicamento(String venta, int unidadesVenta) {

        for (int i = 0; i < listado.size(); i++) {
            if (((listado.get(i).getNombre().equalsIgnoreCase(venta)) && (listado.get(i).getNombre().indexOf(venta) != -1)) || ((listado.get(i).getPrincipiosActivos().equalsIgnoreCase(venta)) && (listado.get(i).getPrincipiosActivos().indexOf(venta) != -1))) {
                if (listado.get(i).getUnidades() >= unidadesVenta) {
                    int contadorUnidadesVendidas = 0;
                    while (contadorUnidadesVendidas != unidadesVenta) {
                        int vueltas = 1;
                        for (int j = 0; j <= vueltas;) {

                            if (listado.get(i).listadoLote.get(j).getTotalUnidadesLote() < unidadesVenta) {
                                contadorUnidadesVendidas += listado.get(i).listadoLote.get(j).getTotalUnidadesLote();
                                listado.get(i).listadoLote.remove(j);
                                vueltas++;
                            }
                            if (listado.get(i).listadoLote.get(j).getTotalUnidadesLote() > unidadesVenta) {
                                listado.get(i).listadoLote.get(j).setTotalUnidadesMedicamento( listado.get(i).listadoLote.get(j).getTotalUnidadesLote()-unidadesVenta);
                                contadorUnidadesVendidas += unidadesVenta;
                            }
                            if (listado.get(i).listadoLote.get(j).getTotalUnidadesLote() == unidadesVenta) {
                                contadorUnidadesVendidas += listado.get(i).listadoLote.get(j).getTotalUnidadesLote();
                                listado.get(i).listadoLote.remove(j);
                            } else {
                                j++;
                            }
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

        int contadorBorrado = 0;
        for (int i = 0; i < listado.size();) {
            if (((listado.get(i).getNombre().equalsIgnoreCase(borrar)) && (listado.get(i).getNombre().indexOf(borrar) != -1)) || ((listado.get(i).getPrincipiosActivos().equalsIgnoreCase(borrar)) && (listado.get(i).getPrincipiosActivos().indexOf(borrar) != -1))) {
                listado.remove(m);
                contadorBorrado += 1;
            } else {
                i++;
            }
        }
    }

    public void caducidad(GregorianCalendar fechaSistem) {

        for (int i = 0; i < listado.size(); i++) {
            for (int j = 0; j < listado.get(i).listadoLote.size();) {
                if (listado.get(i).listadoLote.get(j).getFechaCaducidad().getTimeInMillis() <= fechaSistem.getTimeInMillis()) {
                    listado.get(i).listadoLote.remove(j);
                } else {
                    j++;
                }
            }
        }
    }
}
