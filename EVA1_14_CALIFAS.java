/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_14_califas;
 
import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author eddyi
 */
public class EVA1_14_CALIFAS {

    public static void main(String[] args) {
        
        int calificación;
    
        Scanner captu = new Scanner(System.in);
        System.out.println("Coloque la calificación");
           
        calificación = captu.nextInt();
        
        if(calificación >=70) {
        System.out.println("Acreditaste");
        }else{
            System.out.println("NA");
        }
          
  
    }
}
