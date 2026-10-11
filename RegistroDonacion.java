/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.indoamerica.inventario;

import java.util.Scanner;

/**
 *
 * @author byron
 */
public class RegistroDonacion {
     public static void main(String[] args) {
        System.out.println("=== REGISTRO DE DONACION ===");
        Scanner sc= new Scanner (System.in);
        System.out.println("Ingresa el nombre del donante");
         String nombre =sc.nextLine();
         System.out.println("Ingresa el producto");
         String producto =sc.nextLine();
         System.out.println("Ingresa la cantidad en unidades");
         int cantidad= sc.nextInt();
         System.out.println("Ingresa el valor");
         double valor=sc.nextDouble();
         sc.nextLine();
         System.out.println("Ingresa la fecha");
         System.out.println("Ingresa el día en numero");
         int dia=sc.nextInt();
         System.out.println("Ingresa el mes en numero");
        int mes=sc.nextInt();
        System.out.println("Ingresa el año");
        int ano=sc.nextInt();
       
        
         System.out.println("=== REGISTRO DE DONACION ===");
         System.out.printf("Fecha: %d/ %d/ %d\n",dia,mes,ano);
         System.out.printf("Donante : %s\n",nombre);
         System.out.printf("Producto donado: %s\n",producto);
         System.out.printf("Cantidad(unidades): %d\n",cantidad);
         System.out.printf("Valor unitario estimado (USD) : %.2f\n",valor);
         System.out.println("-----------------");
         System.out.printf("Donante : %s\n", nombre);
         System.out.printf("Producto : %s (%d unidades)%n\n",producto,cantidad);
         System.out.printf("Valor total estimado: $%.2f%n\n",cantidad*valor);
     }
    
    
}
