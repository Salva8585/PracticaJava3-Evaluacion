package com.dam.practica;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ejecuta {

    public static void main(String[] args) {
        //fecha sistema  
        String busqueda;//variable que  introduce el  ususario para la  busqueda
        String consola;//nombre del medicamento que  vamos  añadir
        String venta;// medicamento que  desea comprar
        int unidadesVenta;//unidades que  desea comprar
        int control=0;//control añadir medicamento

        Bayer farmacia = new Bayer();
        GregorianCalendar fechaSistem = new GregorianCalendar();
        farmacia.caducidad(fechaSistem);
        Scanner s = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1.Añadir Medicamento");
            System.out.println("2.Busqueda");
            System.out.println("3.Venta Medicamentos");
            System.out.println("4.Borrado Medicamentos");
            System.out.println("5.Salir");
            opcion = s.nextInt();
            s.nextLine();
            switch (opcion) {
                case 1: {
                    switch (control) {
                        case 1:
                            System.out.println("-Introduzca el precio del medicamento = ");
                            double precioLote = s.nextDouble();
                            System.out.println("-Introduce las  unidades = ");
                            int unidadesLote = s.nextInt();
                            Lote l = new Lote(precioLote, unidadesLote, new GregorianCalendar(), fechaFabricacion.add(Calendar.MONTH, 1));
                            break;
                        case 2:
                            System.out.println("Introduce el nombre medicamento");
                            String nombres = s.nextLine();
                            System.out.println(" introduce el principio activo");
                            String pActivos = s.nextLine();
                            System.out.println("introduce unidades ");
                            int unidadesMedicamento = s.nextInt();
                            s.nextLine();
                            System.out.println("Con receta = 1 | Sin Receta =2");
                            int receta = s.nextInt();
                            s.nextLine();
                            Medicamento m = new Medicamento(nombres, pActivos, unidadesMedicamento,receta);
                            System.out.println("-Introduzca el precio del medicamento = ");
                            double precioMedicamento = s.nextDouble();
                            System.out.println("-Introduce las  unidades = ");
                            int unidadesLote2 = s.nextInt();
                            Lote l2 = new Lote(precioMedicamento, unidadesLote, new GregorianCalendar(), fechaFabricacion.add(Calendar.MONTH, 1));
                            break;
                    }
                }
            }
        } while (opcion != 5);
    }
}
