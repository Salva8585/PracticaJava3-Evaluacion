
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
        opcion=s.nextInt();
        s.nextLine();
        switch(opcion){
        case 1:{
            System.out.println("Introduce el nombre");
            String nombre =s.nextLine();
            ba.añadirMedicamento(nombre, nombre, nombre, opcion, opcion, opcion, opcion, null, null, null);
             break;             
        }
        case 2:{
            System.out.println("Introduce la Busqueda");
            String nombre =s.nextLine();        
                      
        }
         case 3:{
            System.out.println("Introduce el Medicamento que desea comprar ");
            String nombre =s.nextLine();
                  
        }
         case 4:{
            System.out.println("Introduce el atacante");
           
             break;             
        } 
           
        
        
        }
        }while(opcion!=5);
        
        
    }
    String busqueda;//variable que  introduce el  ususario para la  busqueda
String  Consola;//nombre del medicamento que  vamos  añadir
String venta;// medicamento que  desea comprar
int  unidadesVenta;//unidades que  desea comprar
}

    //Nota cuando pedamos   las  fechas al usuario por consola 
    //se las pedimos  como String  y luego la  damos  formato 
    //SimpleDateFormat formato = new SimpleDateFormat( "yyyy-MM-dd" );
    //para que sea  variable  tipo Date  y pasarla  al constructor de lote
    
