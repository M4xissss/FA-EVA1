/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_13_if;

import java.util.Scanner;

/**
 *
 * @author eddyi
 */
public class EVA1_13_IF {

    public static void main(String[] args) {
    
        //CAPTURAR LA EDAD
        
        int edad; 
        
        Scanner captu = new Scanner(System.in);
        System.out.println("EDAD CAPTURA");
        edad = captu.nextInt(); 
        
        if (edad>=18)  {
            System.out.println("Excelente. Eres mayor o tienes 18 años.");
            
        } else {
            System.out.println("No eres mayor a 18 años. Lo sentimos.");
        }
             
    }
}