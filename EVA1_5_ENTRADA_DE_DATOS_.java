/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_entrada_de_datos_;

import java.util.Scanner;

/**
 *
 * @author eddyi
 */
public class EVA1_5_ENTRADA_DE_DATOS_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre; 
        
        //CAPTURA DE DATOS DEL TECLADO;
        //Scanner --> herramienta (clase)
        //Scanner: es un tipo de texto
        Scanner captu; //incorporar la herramienta al código (import)
        //no existe, hay que crearla
        captu = new Scanner(System.in); 
        
        //DARLE LA INSTRUCCIÓN AL USUARIO
        System.out.println("Introduce tu nombre completo:");
        //capturar (asignar un valor a la variable)
        nombre = captu.nextLine();
        
        System.out.println("DATOS CAPTURADOOOS");
        System.out.println (nombre);
    }
    
}
