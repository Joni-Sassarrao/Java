//Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de erro, se necessário. 
//Após a digitação, exibir:
//a) O maior valor;
//b) A soma dos valores;
//c) A média aritmética dos valores;

package Aula_1303;

import java.util.Scanner;

public class Ex28_Aula_1303 {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        
        double num, maior = 0, soma = 0, media;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite o %dº número: ", i);
            num = sc.nextDouble();

            while (num <= 0) {
                System.out.println("Digite apenas números positivos");
                System.out.printf("\nDigite o %dº número: ", i);
                num = sc.nextDouble();
            }

            if (num > maior)
                maior = num;

            soma += num;
        }

        media = soma / 10;
        System.out.printf("O maior número é: %.1f\n", maior);
        System.out.printf("A soma dos números é: %.1f\n", soma);
        System.out.printf("A média aritmética dos números é: %.1f\n", media);

        sc.close();
    }
}
