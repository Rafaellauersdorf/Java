package ExerciciosJava;

import java.util.Scanner;

public class estcond002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        if (n % 2 == 0){
            System.out.println("PAR");
        } else {
            System.out.println("ÍMPAR");
        }

        sc.close();
    }
}
