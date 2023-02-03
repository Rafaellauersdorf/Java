package ExerciciosJava;

import java.util.Locale;
import java.util.Scanner;

public class estseq003 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        double raio1 = sc.nextDouble();
        double raio2 = sc.nextDouble();
        double raio3 = sc.nextDouble();

        double area1 = 3.14159 * Math.pow(raio1,2.0);
        double area2 = 3.14159 * Math.pow(raio2,2.0);
        double area3 = 3.14159 * Math.pow(raio3,2.0);

        System.out.printf("Área = %.4f%n", area1);
        System.out.printf("Área = %.4f%n", area2);
        System.out.printf("Área = %.4f%n", area3);


        sc.close();
    }
    
}
