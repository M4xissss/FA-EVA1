/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_17_control_acceso;

import java.util.Scanner;

/**
 *
 * @author eddyi
 */
public class EVA1_17_CONTROL_ACCESO {

    public static void main(String[] args) {
        
        String usu, pwd; 
        Scanner captu = new Scanner (System.in);
        
        System.out.println("USUARIO:");
        usu = captu.nextLine();
        System.out.println("PASSWORD:");
        pwd = captu.nextLine();
        
       if (usu.equals ("Admin") && pwd.equals("1234")){
        System.out.println("Acceso concedido");
    } else {
        System.out.println("Acceso denegado.");
            }
               
        
    }
}
