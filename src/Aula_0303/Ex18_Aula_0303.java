package Aula_0303;

import java.util.Scanner;

public class Ex18_Aula_0303 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Digite um número positivo: ");
        num = sc.nextInt();

        while (num < 0) {
            System.out.print("Digite um número positivo: ");
            num = sc.nextInt();
        }

        sc.close();
    }
}
