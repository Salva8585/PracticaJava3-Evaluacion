package com.dam.practica;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import sun.security.jca.GetInstance;
import sun.util.calendar.Gregorian;

public class Ejecuta {

    public static void main(String[] args) {
        //fecha sistema  
        String busqueda;//variable que  introduce el  ususario para la  busqueda
        String consola;//nombre del medicamento que  vamos  añadir
        String venta;// medicamento que  desea comprar
        int unidadesVenta;//unidades que  desea comprar
        int control = 0;//control añadir medicamento

        Bayer farmacia = new Bayer();
        SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        GregorianCalendar fechaSistem =new GregorianCalendar();
        GregorianCalendar fechaSistem2 = new GregorianCalendar();
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
                    System.out.println("-Introduce el nombre para comprobar si el medicamento esxiste = ");
                    consola = s.nextLine();
                    Medicamento aux = new Medicamento(consola, null);
                    if (farmacia.getListado().contains(aux)) {
                        System.out.println("-Introduzca precio del medicamento =");
                        double precio = s.nextDouble();
                        System.out.println("-Introduce unidades del medicamento =");
                        int unidadesLote = s.nextInt();
                        fechaSistem2.add(GregorianCalendar.MONTH, 1);
                        Lote l = new Lote(precio, unidadesLote, fechaSistem, fechaSistem2);
                        farmacia.añadirMedicamentoParcial(aux, l);
                    } else {
                        System.out.println("-Introduzca principio activo =");
                        String principioActivo = s.nextLine();
                        System.out.println("-Introduzca el  tipo 1=con recte/2=sin receta =");
                        int tipo = s.nextInt();
                        Medicamento m2 = new Medicamento(consola, principioActivo, 0, tipo);
                        System.out.println("-Introduzca precio del medicamento =");
                        double precio = s.nextDouble();
                        System.out.println("-Introduce unidades del medicamento =");
                        int unidadesLote = s.nextInt();
                        fechaSistem2.add(GregorianCalendar.MONTH, 1);
                        Lote l = new Lote(precio, unidadesLote, fechaSistem, fechaSistem2);
                        farmacia.añadirMedicamentoFull(m2, l);
                    }
                    break;
                }
                case 2: {
                    System.out.println("- 1 busqueda por nombre");
                    System.out.println("-2 busqueda por  principio activo");
                    int op2 = s.nextInt();
                    switch (op2) {
                        case 1: {
                            System.out.println("-Introduzca el nombre del medicamento =");
                            busqueda = s.nextLine();
                            farmacia.busquedaNombre(busqueda);
                            break;
                        }
                        case 2: {
                            System.out.println("-Introduzca el principio activo del medicamento =");
                            busqueda = s.nextLine();
                            farmacia.busquedaPrincipio(busqueda);
                            break;
                        }
                        default:
                            System.out.println("-----ERROR-----opción no valida");
                    }
                    break;
                }
                case 3: {
                    System.out.println("-Introduce el nombre del medicamento = ");
                    venta=s.nextLine();
                    System.out.println("-Introduce unidades");
                    unidadesVenta=s.nextInt();
                    s.nextLine();
                    farmacia.ventaMedicamento(venta, unidadesVenta);     
                }

            }
        } while (opcion != 5);
//        for (int i = 0; i <= farmacia.listado.size(); i++) {
//            System.out.println(farmacia.listado.get(i));
//            for (int j = 0; j <= farmacia.listado.get(i).listadoLote.size(); j++) {
//                System.out.println(farmacia.listado.get(i).listadoLote.get(j));
//            }
//        }
    }
}
