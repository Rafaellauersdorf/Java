package exerciciosDiversos.exerciciosbeecrowd;

import java.util.Locale;
import java.util.Scanner;

public class bee1002 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();
        double area = 3.14159 * Math.pow(raio, 2.0);

        System.out.printf("A=%.4f%n",area);

        sc.close();
    }
}
