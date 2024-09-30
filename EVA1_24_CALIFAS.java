/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_24_califas;

import java.util.Scanner;

/**
 *
 * @author eddyi
 */
public class EVA1_24_CALIFAS {

    public static void main(String[] args) {
     
        
        int califa;
        Scanner captu = new Scanner (System.in);
        
        System.out.println("Captura la calificacion del 1 al 100");
        califa = captu.nextInt();
        
        if (califa >=0 && califa <= 59){
        System.out.println("Tu calificacion es F"); 
        
        }else if (califa >= 60 && califa <= 69){
        System.out.println("Tu calificacion es D"); 
        
        }else if (califa >= 70 && califa <= 69){
        System.out.println("Tu calificacion es C"); 
        
        }else if (califa >= 80 && califa <= 69){
        System.out.println("Tu calificacion es B"); 
        
        }else if (califa >= 90 && califa <= 69){
        System.out.println("Tu calificacion es A"); 
        
        }else if (califa > 100){
        System.out.println("Tu calificacion no valida"); 
        
        }else if (califa < 0){
        System.out.println("Calificacion no valida");
        
      
        }
    }
}
