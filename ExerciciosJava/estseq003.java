package ExerciciosJava;

import java.util.Scanner;

public class estseq003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 8 valores para mostrarmos a diferença: ");

        int A1 = sc.nextInt();
        int A2 = sc.nextInt();
        int A3 = sc.nextInt();
        int A4 = sc.nextInt();
        int A5 = sc.nextInt();
        int A6 = sc.nextInt();
        int A7 = sc.nextInt();
        int A8 = sc.nextInt();

        int diferenca1 = (A1*A2 - A3*A4);
        int diferenca2 = (A5*A6 - A7*A8);

        System.out.println("DIFERENÇA = " + diferenca1);
        System.out.println("DIFERENÇA = " + diferenca2);


        sc.close();
    }
    
}
