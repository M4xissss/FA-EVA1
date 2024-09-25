/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_20_if_else_anidado;

import java.util.Scanner;

/**
 *
 * @author eddyi
 */
public class EVA1_20_IF_ELSE_ANIDADO {

    public static void main(String[] args) {
    
        int days;
         Scanner captu = new Scanner(System.in);
         System.out.println("Captura el número del día de la semana:");
         days = captu.nextInt();
         captu.nextLine(); 
        
         
         if(days == 1){
         System.out.println("Domingo");
         }else if (days == 2){
         System.out.println("Lunes");
         }else if (days == 3){
          System.out.println("Martes");
         }else if (days == 4){
          System.out.println("Miércoles");
         }else if (days == 5){
         System.out.println("Jueves");
         }else if (days == 6){
          System.out.println("Viernes");
         }else if (days == 7){
          System.out.println("Sábado");
         }else{
             System.out.println("Número de día es incorrecto");}
             
         
    
         
         }
         
                 
    }

