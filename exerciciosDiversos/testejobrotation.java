package exerciciosDiversos;

import java.util.Scanner;

public class testejobrotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int indice = 13;
        int soma = 0;
        int k = 0;

        while (k < indice) {
            k = k + 1;
            soma = soma + k;
        }

        System.out.println(soma);

        sc.close();
    }
} 