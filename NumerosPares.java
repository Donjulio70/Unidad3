/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeros.pares;
import java.util.Scanner;
/**
 *
 * @author Julio Qurino
 */
public class NumerosPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner abc = new Scanner(System.in);
        
        System.out.println("Cual es el numero");
        int numero = abc.nextInt();
        
        
        if (numero % 2 == 0) {
        System.out.println("Es par");
    } else {
        System.out.println("Es impar");
    }
    }
    
}
