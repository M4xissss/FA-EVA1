/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_8_pelicula;

import java.util.Scanner;

/**
 *
 * @author eddyi
 */
public class EVA1_8_PELICULA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       String Nombre;
       String Genero; 
       int Duración;
       String Reparto; 
       String Clasificación;
       
       Scanner captu;
       captu = new Scanner (System.in);
       
       System.out.println ("Captura el Nombre:");
       Nombre = captu.nextLine();
       System.out.println ("Captura el Genero:");
       Genero = captu.nextLine();
       System.out.println ("Captura la Duración:");
       Duración = captu.nextInt();
       String nextLine = captu.nextLine();
       System.out.println ("Captura el Reparto:");
       Reparto = captu.nextLine();
       System.out.println ("Captura la Clasificación:");
       Clasificación = captu.nextLine();
       
       System.out.println("IMPRESIÓN DE LAS CAPTURAS!!");
       
       System.out.println(Nombre);
       System.out.println(Genero);
       System.out.println(Duración);
       System.out.println(Reparto);
       System.out.println(Clasificación);
                       
       
        
             
    }
    
}
