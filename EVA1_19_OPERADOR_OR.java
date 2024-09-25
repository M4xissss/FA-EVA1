/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_19_operador_or;

import java.util.Scanner;

/**
 *
 * @author eddyi
 */
public class EVA1_19_OPERADOR_OR {

    public static void main(String[] args) {
        
        int km, meses;
        Scanner captu = new Scanner (System.in);
        System.out.println("Ingresa los meses:");
        meses = captu.nextInt();
        
        System.out.println("Ingresa el kilometraje:");
        km = captu.nextInt();
        
        if(km >= 5000 || meses >= 6){
        System.out.println("NECESITA CAMBIO DE ACEITE");
           }else{
        System.out.println("NO NECESITA CAMBIO DE ACEITE");
        }
        
        
    }
}
