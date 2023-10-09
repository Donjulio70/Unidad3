/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serie.fibonacci;

import java.util.Scanner;

/**
 *
 * @author Julio Quirino
 */
public class SerieFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner abc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad");
        int cant = abc.nextInt();
        int b1 = 0;
        int b2 = 1;
        
        for (int i = 0; i< cant; i++) {
            int cocientedelasumadedosnumeros = b1 + b2;
            b1=b2;
            b2=cocientedelasumadedosnumeros;
            System.out.println("la suma es: " + cocientedelasumadedosnumeros);
        }
    }
        
}


