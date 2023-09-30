/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajerotelmex;
import java.util.Scanner;
/**
 *
 * @author Julio Qurino
 */
public class Cajerotelmex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner abc = new Scanner(System.in);
        System.out.println("Bienvenido al cajero automatico");
        System.out.println("Selecciona una de las siguientes opciones");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Depositar dinero");
        System.out.println("3. Retirar dinero");
        int opcion = abc.nextInt();
        
        double saldo = 5000.55;
      
        
        switch (opcion){
            case 1:
                saldo = saldo;
                    System.out.println("Su saldo es " +saldo);
                break;
            case 2:
                System.out.println("Ingresa la cantidad a depositar");
                double deposito = abc.nextDouble();
                saldo += deposito;
            System.out.println("Su saldo es " +saldo);
                break;
            case 3:
                System.out.println("ingresa la cantidad a retirar");
                double retiro = abc.nextDouble();
                saldo -= retiro;
                if (retiro <=(5000.55)){
                    System.out.println("El retiro fue existoso");
                }else{
                    System.out.println("Fondos insuficientes");
                }
            break;
            default: 
                System.out.println("Por favor selecciona una opcion valida");
                break;
        }
                
    }
    }
    

