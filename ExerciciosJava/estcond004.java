package ExerciciosJava;

import java.util.Scanner;

public class estcond004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaIni = sc.nextInt();
        int horaFin = sc.nextInt();

        int duracao;
        if (horaIni < horaFin) {
            duracao = horaFin - horaIni;
        } else {
            duracao = 24 - horaIni + horaFin;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }
}
