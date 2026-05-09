package Aula_0505;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaProd {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Produto> listaProdutos = new ArrayList<>();

        int opcao, codigo, id_produtos, qtn;

        while (true) {
            System.out.println("\n=== Controle de Estoque ===\n");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Entrada do Produto");
            System.out.println("3 - Venda do Produto");
            System.out.println("4 - Consultar Estoque");
            System.out.println("5 - Sair");

            System.out.print("\nDigite a opção desejada: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                sc.nextLine();
                Produto produto = new Produto();

                codigo = listaProdutos.size();
                produto.setCodigo(codigo);

                System.out.print("Digite o nome do Produto: ");
                String nome = sc.nextLine();
                produto.setNome(nome);

                System.out.print("Digite o preço do Produto: ");
                double preco = sc.nextDouble();
                produto.setPreco(preco);

                listaProdutos.add(produto);

                System.out.println("\nProduto Cadastrado");
            } else if (opcao == 2) {
                System.out.println("\nLista de Produtos\n");
                for (Produto p: listaProdutos) {
                    p.consulta();
                }

                System.out.print("\nDigite o código do Produto: ");
                id_produtos = sc.nextInt();

                System.out.print("\nDigite o valor de entrada do Produto: ");
                qtn = sc.nextInt();

                listaProdutos.get(id_produtos).entradaProd(qtn);
            } else if (opcao == 3) {
                System.out.println("\nLista de Produtos\n");
                for (Produto p: listaProdutos) {
                    p.consulta();
                }

                System.out.print("\nDigite o código do Produto: ");
                id_produtos = sc.nextInt();

                System.out.print("\nDigite o valor da venda do Produto: ");
                qtn = sc.nextInt();

                listaProdutos.get(id_produtos).vendaProd(qtn);
            } else if (opcao == 4) {
                System.out.println("\nLista de Produtos\n");
                for (Produto p: listaProdutos) {
                    p.consulta();
                }
            } else
                break;
        }
        sc.close();
    }
}
