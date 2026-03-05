package Aula_0303;

import java.util.Scanner;

public class Ex19_Aula_0303 {
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

        sc.close();
    }
}
