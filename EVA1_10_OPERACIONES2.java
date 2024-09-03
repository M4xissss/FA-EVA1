/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_operaciones2;

/**
 *
 * @author eddyi
 */
public class EVA1_10_OPERACIONES2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //CONCATENACIÓN CADENAS:
        //OPERADOR DE CONCATENACIÓN +
        //Mismo símbolo con diferentes usos:
        //Sobrecarga de operadores
      
      String nombre = "Damian";
      String apellido = "Isaias";
      String nomComp;
      //concatenar: unir cadenas de texto
      nomComp = nombre + " " + apellido;
      System.out.println(nomComp);
      //imprimir los datos:
      System.out.println("Nombre del usuario:" + nombre);
      System.out.println("Apellido del usuario:" + apellido);
      System.out.println("Nombre completo del usuario:" + nomComp);
        
    }
    
}
