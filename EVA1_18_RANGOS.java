/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_18_rangos;

import java.util.Scanner;

/**
 *
 * @author eddyi
 */
public class EVA1_18_RANGOS {

    public static void main(String[] args) {
        
        int calificación;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce una calificación");
        calificación = captu.nextInt();
        
        if(calificación >= 0 && calificación <= 100){
        System.out.println("CALIFICACIÓN VÁLIDA");
               }else{
        System.out.println("CALIFICACIÓN NO VÁLIDA");
        }
        
        
        
        
    }
}
