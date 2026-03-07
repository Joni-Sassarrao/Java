package Aula_0603;

import java.util.Scanner;

public class Ex21_Aula_0603 {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);

        int a,b;

        System.out.print("Digite o primeiro número: ");
        a = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        b = sc.nextInt();

        while (a > b) {
            System.out.print("Digite um número maior que o primeiro: ");
            b = sc.nextInt();
        }

        while (b < 0) {
            System.out.print("Digite um número positivo: ");
            b = sc.nextInt();
        }

        for (int i = 1; i <= a; i++) {
            int t = b * i;
            System.out.printf("%d X %d = %d\n", b, i, t);
        }

        sc.close();
    }
}
