/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_23;

import java.util.Scanner;

/**
 *
 * @author eddyi
 */
public class EVA1_23 {

    public static void main(String[] args) {
         int meses;
         Scanner captu = new Scanner(System.in);
         System.out.println("Captura el mes del año:");
         meses = captu.nextInt();
         captu.nextLine();
         
        //ELEGIR ENTRE MÚLTIPLES ALTERNATIVAS
         switch(meses){
             case 1: 
                 System.out.println("Enero");
                 break; //interrumpir el switch (lo termina)
                      case 2: 
                 System.out.println("Febrero");
                 break; //interrumpir el switch (lo termina)
                      case 3: 
                 System.out.println("Marzo");
                 break; //interrumpir el switch (lo termina)
                      case 4: 
                 System.out.println("Abril");
                 break; //interrumpir el switch (lo termina)
                      case 5: 
                 System.out.println("Mayo");
                 break; //interrumpir el switch (lo termina)
                      case 6: 
                 System.out.println("Junio");
                 break; //interrumpir el switch (lo termina)
                      case 7: 
                 System.out.println("Julio");
                 break; 
                                       case 8: 
                 System.out.println("Agosto");
                 break; 
                                       case 9: 
                 System.out.println("Septiembre");
                 break; 
                                       case 10: 
                 System.out.println("Octubre");
                 break; 
                                       case 11: 
                 System.out.println("Noviembre");
                 break; 
                                       case 12: 
                 System.out.println("Diciembre");
                 break; 
                      default: //Opcional, se ejecuta cuando no existe una opción
                       //no tiene break, Y ES LA ÚLTIMA INSTRUCCIÓN DEL SWITCH
                          System.out.println("Mes no valido");
                          }
    }
}