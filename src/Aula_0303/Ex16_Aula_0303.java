package Aula_0303;

import java.util.Scanner;

public class Ex16_Aula_0303 {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);

        double media,p1,p2;

        System.out.print("Digite sua nota P1: ");
        p1 = sc.nextDouble();

        System.out.print("Digite sua nota P2: ");
        p2 = sc.nextDouble();

        media = (p1 + (p2 * 2)) / 3;

        System.out.printf("Média: %.1f\n", media);

        if (media >= 5)
            System.out.println("Aprovado!");
        else
            System.out.println("Reprovado!");

        sc.close();
    }
}
