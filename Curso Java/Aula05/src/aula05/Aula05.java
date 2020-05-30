package aula05;

import java.util.Scanner;

public class Aula05 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Banco bb=new Banco("CC", true);
        bb.setSaldo(2323f);
        bb.pagarMensal();
        bb.sacar(3000f);
        System.out.println("Status "+ bb.getSaldo());
        
    }
    
}
