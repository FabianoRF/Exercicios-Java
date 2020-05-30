/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;


public class TiposPrimitivos {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome= teclado.nextLine();
        System.out.println("Digite sua nota: ");
        float n=teclado.nextFloat();
                
        System.out.printf("O %s tem a nota: %.2f", nome, n);
        
        
        
        
    }
    
}
