/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author Sammy Giulia
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        int idade;
        System.out.println ("Hello world!");
        System.out.println("Digite sua idade:");
        idade = entrada.nextInt();
        System.out.printf("Sua idade é " + idade + "!\n");
        
        
    }
    
}
