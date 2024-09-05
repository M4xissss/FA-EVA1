/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_12_formulaa;

import java.util.Scanner;

/**
 *
 * @author eddyi
 */
public class EVA1_12_FORMULAA {

    public static void main(String[] args) {
        double Vo, a, t, d;
        Scanner captu = new Scanner (System.in);
        
        System.out.println("Velocidad inicial:");
        Vo = captu.nextDouble();
        System.out.println("Aceleración");
        a = captu.nextDouble();
        System.out.println("Tiempo:");
        t = captu.nextDouble();
        
        d = Vo * t + (a * t * t)/2.0;
        
        System.out.println("Distancia = " + d);
    }
}
