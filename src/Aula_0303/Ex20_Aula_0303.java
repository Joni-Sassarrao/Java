package Aula_0303;

import java.util.Scanner;

public class Ex20_Aula_0303 {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Digite um número: ");
        num = sc.nextInt();

        while (num < 0) {
            System.out.print("Digite um número positivo: ");
            num = sc.nextInt();
        }

        for (int i = 1; i <= 10; i++) {
            int t = num * i;
            System.out.println(t);
        }

        sc.close();
    }
}
