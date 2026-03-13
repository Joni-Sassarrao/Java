package Aula_1003;

import java.util.Scanner;

public class Ex26_Aula_1003 {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int soma = 0;

        System.out.print("Digite um número: ");
        n = sc.nextInt();

        while (n > 100 || n <= 0) {
            System.out.print("Digite um número positivo menor que 100: ");
            n = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            double soma2 = Math.pow(i, 2) + 1;
            double j = soma2 + 1;
            soma += j;
        }

        System.out.print(soma);

        sc.close();
    }
}
