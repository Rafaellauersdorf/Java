package ExerciciosJava;

import java.util.Locale;
import java.util.Scanner;

public class objeto002 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        Double salBruto = sc.nextDouble();
        Double imposto = sc.nextDouble();
        Double salLiquido = salBruto - imposto;

        System.out.print("Funcionário: " + name + ", ");
        System.out.printf("Salário Líquido: %.2f%n", salLiquido);
        
        Double porcentagem;
        System.out.printf("Qual porcentagem incluirá no salário? %.1f%n", porcentagem);
        Double porcentagem = sc.nextDouble();

        



        sc.close();
    }
}
