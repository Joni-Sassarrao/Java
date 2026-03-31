package Aula_2703;

import java.util.Scanner;

public class prod_cadastrados {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);

        produtos[] listaProdutos = new produtos[10];

        for (int i = 0; i < 2; i++) {

            produtos prod = new produtos();

            prod.id = i + 1;

            System.out.print("\nDigite a descrição do produto: ");
            prod.descricao = sc.next();

            System.out.print("Digite o valor do produto: ");
            prod.valor = sc.nextDouble();

            System.out.print("Digite a quantidade de produtos restantes: ");
            prod.quantidade = sc.nextDouble();

            listaProdutos[i] = prod;
        }

        for (int i = 0; i < 2; i++) {
            if (listaProdutos[i].valor < 100 && listaProdutos[i].quantidade > 10) {
                System.out.println("\nId do produto: " + listaProdutos[i].id);
                System.out.println("Descrição do produto: " + listaProdutos[i].descricao);
                System.out.println("Valor do produto: " + listaProdutos[i].valor);
                System.out.println("Quantidade de produtos restantes: " + listaProdutos[i].quantidade + "\n");
            }
        }

        sc.close();
    }
}
