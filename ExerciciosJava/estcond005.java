package ExerciciosJava;

import java.util.Scanner;

public class estcond005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int quant = sc.nextInt();

        double total;
        if(codigo == 1){
            total = quant * 4.0;
        } else if (codigo == 2) {
            total = quant * 4.5;
        } else if (codigo == 3) {
            total = quant * 5.0;
        } else if (codigo == 4) {
            total = quant * 2.0;
        } else {
            total = quant * 1.5;
        }
        System.out.printf("Total: R$ %.2f%n", total);

        sc.close();
    }
}
