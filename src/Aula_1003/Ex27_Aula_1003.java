//Calcular e exibir a soma dos “N” primeiros valores da
//sequência abaixo. O valor “N” será digitado, deverá ser positivo,
//mas menor que cinqüenta. Caso o valor não satisfaça a restrição,
//enviar mensagem de erro e solicitar o valor novamente.
//A sequência é: 1/2, 2/3, 3/4, 4/5

package Aula_1003;

import java.util.Scanner;

public class Ex27_Aula_1003 {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);

        int n;
        double soma = 0;

        System.out.print("Digite um número: ");
        n = sc.nextInt();

        while (n > 50 || n <= 0) {
            System.out.print("Digite um número positivo menor que 50: ");
            n = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            double numerador = i;
            double demominador = i + 1;
            double soma2 = numerador / demominador;
            soma += soma2;
        }

        System.out.print(soma);

        sc.close();
    }
}
