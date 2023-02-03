package ExerciciosJava;

import java.util.Scanner;

public class estseq002 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();
        int valor3 = sc.nextInt();
        int valor4 = sc.nextInt();
        int valor5 = sc.nextInt();
        int valor6 = sc.nextInt();

        int soma1 = valor1 + valor2;
        int soma2 = valor3 + valor4;
        int soma3 = valor5 + valor6;

        System.out.println("SOMA = " + soma1);
        System.out.println("SOMA = " + soma2);
        System.out.println("SOMA = " + soma3);
    
        sc.close();    
    }
}
