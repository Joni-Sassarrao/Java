package EstudoParaCP;

import java.util.Scanner;

public class LojaPrograma {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);

        Loja[] produtos = new Loja[10];

        int opcao, id = 0, id_produto, qtnd;

        while(true) {
            System.out.println("=== Controle de Estoque ===\n");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Entrada do Produto");
            System.out.println("3 - Venda do Produto");
            System.out.println("4 - Consultar Produto");
            System.out.println("5 - Sair");

            System.out.print("\nDigite a opção desejada: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                sc.nextLine();

                System.out.print("Digite o nome do produto: ");
                String nome = sc.nextLine();

                System.out.print("Digite o preço do produto: ");
                double preco = sc.nextDouble();

                Loja l = new Loja(id, nome, preco);

                produtos[id] = l;
                id++;

                System.out.println("\nProduto Cadastrado\n");
            } else if (opcao == 2) {
                System.out.println("Lista de Produtos cadastrados: ");
                for (int i = 0; i < id; i++) {
                    produtos[i].consultar();
                }

                System.out.print("Digite o código do produto para realizar a entrada: ");
                id_produto = sc.nextInt();

                System.out.print("Digite o valor de entrada do produto: ");
                qtnd = sc.nextInt();

                produtos[id_produto].adicionarEstoque(qtnd);

                System.out.println("Entrada do produto " + produtos[id_produto].getNome() + " realizado");
            } else if (opcao == 3) {
                System.out.println("Lista de Produtos cadastrados: ");
                for (int i = 0; i < id; i++) {
                    produtos[i].consultar();
                }

                System.out.print("Digite o código do produto para realizar a venda: ");
                id_produto = sc.nextInt();

                System.out.print("Digite o valor da venda do produto: ");
                qtnd = sc.nextInt();

                produtos[id_produto].retirarEstoque(qtnd);

                System.out.println("Venda do produto " + produtos[id_produto].getNome() + " realizado");
            } else if (opcao == 4) {
                System.out.println("Lista de Produtos cadastrados: ");
                for (int i = 0; i < id; i++) {
                    produtos[i].consultar();
                }
            } else
                break;
        }
        sc.close();
    }
}
