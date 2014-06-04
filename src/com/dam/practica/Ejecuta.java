package com.dam.practica;

import java.util.Scanner;

        
public class Ejecuta {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Bayer ba = new Bayer();

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
                    System.out.println("Introduce el nombre medicamento");
                    String nombres = s.nextLine();
                    System.out.println(" introduce el principio activo");
                    String pActivos = s.nextLine();
                    System.out.println("introduce unidades ");
                    int unidades = s.nextInt();
                    s.nextLine();
                    System.out.println("Con receta = 1 | Sin Receta =2");
                    int receta = s.nextInt();
                    s.nextLine();
                    System.out.println("Introduce precio del medicamento");
                    int precio = s.nextInt();
                    s.nextLine();
                    Medicamento m = new Medicamento(nombres, pActivos, unidades, precio);
                    Lote l = new Lote(precio, unidades, null, null);
                    if (ba.añadirMedicamento(m,l) {
                        System.out.println("Medicamento creado");
                    } else {
                        System.out.println("");
                    }
                    break;
                    
                    break;
                }
                case 2: {
                    System.out.println("Introduce la Busqueda");
                    String nombre = s.nextLine();

                }
                case 3: {
                    System.out.println("Introduce el Medicamento que desea comprar ");
                    String nombre = s.nextLine();

                }
                case 4: {
                    System.out.println("Introduce el atacante");

                    break;
                }

    public static void main(String[] args) {
        //fecha sistema  
        String busqueda;//variable que  introduce el  ususario para la  busqueda
        String consola;//nombre del medicamento que  vamos  añadir
        String venta;// medicamento que  desea comprar
        int unidadesVenta;//unidades que  desea comprar
        int control=0;//control añadir medicamento


            }
        } while (opcion != 5);


    }
    String busqueda;//variable que  introduce el  ususario para la  busqueda
    String Consola;//nombre del medicamento que  vamos  añadir
    String venta;// medicamento que  desea comprar
    int unidadesVenta;//unidades que  desea comprar
}
//Nota cuando pedamos   las  fechas al usuario por consola 
//se las pedimos  como String  y luego la  damos  formato 
//SimpleDateFormat formato = new SimpleDateFormat( "yyyy-MM-dd" );
//para que sea  variable  tipo Date  y pasarla  al constructor de lote

