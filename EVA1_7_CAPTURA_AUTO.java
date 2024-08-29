/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_captura_auto;

import java.util.Scanner;

/**
 *
 * @author eddyi
 */
public class EVA1_7_CAPTURA_AUTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
           
    String marca;
    String modelo; 
    int year;
    double precio;
    
    Scanner captu;
    captu = new Scanner (System.in);
    
    System.out.println("Captura la marca:");
    marca = captu.nextLine();
    System.out.println("Captura el modelo:");
    modelo = captu.nextLine();
    System.out.println("Capture the year:");
    year = captu.nextInt();
    System.out.println("Captura el precio:");
    precio = captu.nextDouble();
    
    
    System.out.println(marca);
    System.out.println(modelo);
    System.out.println(year);
    System.out.println(precio);
    }
    
}
