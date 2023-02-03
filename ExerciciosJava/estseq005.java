package ExerciciosJava;

import java.util.Locale;
import java.util.Scanner;

public class estseq005 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
            int codpec = sc.nextInt();
            int numpec = sc.nextInt();
            double valpec = sc.nextDouble();
            int codpec2 = sc.nextInt();
            int numpec2 = sc.nextInt();
            double valpec2 = sc.nextDouble();

            double valpagar = (numpec * valpec) + (numpec2 * valpec2);

            System.out.printf("VALOR A PAGAR: R$ %.2f%n", valpagar);

        sc.close();
    }
}
