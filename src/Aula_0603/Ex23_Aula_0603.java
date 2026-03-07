package Aula_0603;

import java.util.Scanner;

public class Ex23_Aula_0603 {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            soma += i;
            System.out.printf("\n" + soma);
        }

        sc.close();
    }
}
