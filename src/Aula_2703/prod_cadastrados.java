package Aula_2703;

import java.util.Scanner;

public class prod_cadastrados {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);

        produtos[] listaProdutos = new produtos[10];
        produtos prod = new produtos();

        for (int i = 0; i < 5; i++) {
            prod.id = i;

            System.out.print("Digite a descrição do produto: ");
            prod.descricao = sc.next();

            System.out.print("Digite o valor do produto: ");
            prod.valor = sc.nextDouble();

            System.out.print("Digite a quantidade de produtos restantes: ");
            prod.quantidade = sc.nextDouble();

            listaProdutos[i] = prod;
        }

        for (int i = 0; i < 2; i++) {
            if (prod.valor < 100 || prod.quantidade > 10) {
                System.out.printf("\nId do produto: " + listaProdutos[i].id);
                System.out.printf("\nDescrição do produto: " + listaProdutos[i].descricao);
                System.out.printf("\nValor do produto: " + listaProdutos[i].valor);
                System.out.printf("\nQuantidade de produtos restantes: " + listaProdutos[i].quantidade + "\n\n");
            }
        }

        sc.close();
    }
}
