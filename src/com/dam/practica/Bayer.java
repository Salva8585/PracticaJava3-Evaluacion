package com.dam.practica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Bayer implements Serializable {//necesario implementar este  interface para poder  guardar el objeto en la libreria

   private ArrayList<Medicamento> listado = new ArrayList<>();

    public ArrayList<Medicamento> getListado() {
        return listado;
    }
    public void setListado(ArrayList<Medicamento> listado) {
        this.listado = listado;
    }
   

    public void añadirMedicamentoParcial(Medicamento m, Lote l) {
        int pos = listado.indexOf(m);
        listado.get(pos).getListadoLote().add(l);
        listado.get(pos).setUnidades(listado.get(pos).getUnidades() + l.getTotalUnidadesLote());
        for (int j = 0; j <listado.get(pos).getListadoLote().size(); j++) {
            double cambioPrecio = l.getPrecio();
            listado.get(pos).getListadoLote().get(j).setPrecio(cambioPrecio);
        }
        System.out.println("lote añadido");
    }

    public void añadirMedicamentoFull(Medicamento m2, Lote l) {
        listado.add(m2);
        m2.getListadoLote().add(l);
        m2.setUnidades(m2.getUnidades() + l.getTotalUnidadesLote());
        System.out.println("medicamento añadido");
    }

    public boolean busquedaNombre(String busqueda) {
        Medicamento aux = new Medicamento(busqueda, null);
        if (listado.contains(aux)) {
            int pos = listado.indexOf(aux);
            System.out.println(listado.get(pos));
            return true;
        }
        return false;
    }

    public boolean busquedaPrincipio(String busqueda) {
        Medicamento aux = new Medicamento(null, busqueda);
        if (listado.contains(aux)) {
            int pos = listado.indexOf(aux);
            System.out.println(listado.get(pos));
            return true;
        }
        return false;
    }

    public void ventaMedicamento(String venta, int unidadesVenta) {
        Medicamento aux = new Medicamento(venta, null);
        if (listado.contains(aux)) {
            int pos = listado.indexOf(aux);
            if (listado.get(pos).getUnidades() >= unidadesVenta) {
                int contadorUnidadesVendidas = 0;
                while (contadorUnidadesVendidas != unidadesVenta) {
                    int vueltas = 1;
                    for (int j = 0; j < vueltas;) {
                        if (listado.get(pos).getListadoLote().get(j).getTotalUnidadesLote() < unidadesVenta) {
                            contadorUnidadesVendidas += listado.get(pos).getListadoLote().get(j).getTotalUnidadesLote();
                            listado.get(pos).getListadoLote().remove(j);
                            vueltas++;
                        }
                        if (listado.get(pos).getListadoLote().get(j).getTotalUnidadesLote() > unidadesVenta) {
                            listado.get(pos).getListadoLote().get(j).setTotalUnidadesMedicamento(listado.get(pos).getListadoLote().get(j).getTotalUnidadesLote() - unidadesVenta);
                            contadorUnidadesVendidas += unidadesVenta;
                        }
                        if (listado.get(pos).getListadoLote().get(j).getTotalUnidadesLote() == unidadesVenta) {
                            contadorUnidadesVendidas += listado.get(pos).getListadoLote().get(j).getTotalUnidadesLote();
                            listado.get(pos).getListadoLote().remove(j);
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

    public boolean borradoMedicamento(String borrar) {
        Medicamento aux = new Medicamento(borrar, null);
        if (busquedaNombre(borrar) == true) {
            listado.remove(aux);
            return true;
        }
        return false;
    }

    public void caducidad(GregorianCalendar fechaSistem) {

        for (int i = 0; i < listado.size(); i++) {
            for (int j = 0; j < listado.get(i).getListadoLote().size();) {
                if (listado.get(i).getListadoLote().get(j).getFechaCaducidad().getTimeInMillis() <= fechaSistem.getTimeInMillis()) {
                    listado.get(i).getListadoLote().remove(j);
                } else {
                    j++;
                }
            }
        }
    }
}
