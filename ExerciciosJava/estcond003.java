package ExerciciosJava;

import java.util.Scanner;

public class estcond003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A % 2 == 0 && B % 2 == 0){
            System.out.println("São Múltiplos");
        } else {
            System.out.println("Não são Múltiplos");
        }

        sc.close();
    }
}
