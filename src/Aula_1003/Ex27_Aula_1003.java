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
        double s = 0, numerador = 0, denominador = 0;


        System.out.print("Digite a quantidade de elementos que a sequência terá: ");
        n = sc.nextInt();

        while (n < 1 || n > 50){
            System.out.println("Erro! Digite apenas números entre 1 e 50!");
            System.out.print("Digite a quantidade de elementos que a sequência terá: ");
            n = sc.nextInt();
        }

        for (int i = 1; i <= n; i++){
            numerador = i;
            denominador = (i+1);
            System.out.printf("%.0f / %.0f\n", numerador, denominador);
            s += (numerador / denominador);
        }

        System.out.printf("A soma dos valores é: %.2f", s);

        sc.close();
    }
}
