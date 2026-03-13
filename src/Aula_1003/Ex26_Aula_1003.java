//Calcular e exibir a soma dos “N” primeiros valores da seqüência abaixo. O valor “N” será
//digitado, deverá ser positivo, mas menor que cem. Caso o valor não satisfaça a restrição,
//enviar mensagem de erro e solicitar o valor novamente. A seqüência: 2, 5, 10, 17, 26, ....

package Aula_1003;

import java.util.Scanner;

public class Ex26_Aula_1003 {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);

        int n;
        double soma = 0;

        System.out.print("Digite um número: ");
        n = sc.nextInt();

        while (n > 100 || n <= 0) {
            System.out.print("Digite um número positivo menor que 100: ");
            n = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            double soma2 = Math.pow(i, 2) + 1;
            soma += soma2;
        }

        System.out.print(soma);

        sc.close();
    }
}
