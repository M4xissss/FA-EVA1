/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_operaciones;

/**
 *
 * @author eddyi
 */
public class EVA1_9_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //OPERACIONES ARITMÉTICAS 
        //Inicialización de una variable 
        int x = 10; //declaración y asignación
        int y = 5; 
        //Si necesitan muchas variables: 
        int suma, resta, mult, div, pot, raíz; 
        
        //suma y resta 
        suma = x + y; //operador de suma +
        System.out.println("La suma de x + y:");
        System.out.println(suma);
        
        resta = x - y; 
        System.out.println("Resta de x - y:");
        System.out.println(resta);
        
        //MULTIPLICACIÓN
        mult = x * y; //operador de multiplicación *
        System.out.println("La multiplicación de x * y:");
        System.out.println(mult);
        
        //DIVISIÓN
        //En Java, las operaciones dependen del tipo de dato 
        //Divides entero, Java da como resultado entero 
        div = x / y; //operador de división: /
        System.out.println("El resultado de la división x (10) / y (5)");
        System.out.println(div);
        x = 5;
        y = 2;
        div = x / y;
        System.out.println("División de x (5) / y (2)");
        System.out.println(div);
        
        //división con número con punto flotante 
        double val1 = 5;
        double val2 = 2;
        double resu;
        resu = val1 / val2 ;
        System.out.println("División de val1 (5) / val2 (2)");
        System.out.println(resu);
        
                
       
        
                                   
       }
    
}
