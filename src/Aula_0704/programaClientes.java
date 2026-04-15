package Aula_0704;

import java.util.Scanner;

public class programaClientes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        clientes[] listaClientes = new clientes[20];
        int opcao, id=0, id_cliente;
        String nome, agencia, conta;
        double valor;

        while(true){
            System.out.println("=== Menu Java Banking ===");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Emitir Saldo");
            System.out.println("5 - Sair");

            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();

            if (opcao == 1){
                System.out.print("Digite o nome do cliente: ");
                nome = sc.next();

                System.out.print("Digite a agência do cliente: ");
                agencia = sc.next();

                System.out.print("Digite a conta do cliente: ");
                conta = sc.next();

                clientes c = new clientes(agencia, conta, 0, nome);

                listaClientes[id] = c;
                id++;

                System.out.println("Cliente cadastrado com sucesso!");
            }
            else if (opcao == 2){
                System.out.println("Lista de Clientes:");
                for (int i=0; i<id; i++) {
                    System.out.println("Id: " + i + " | Agencia: " + listaClientes[i].agencia + " | Conta: " + listaClientes[i].conta + " | Nome: " + listaClientes[i].nome + " | Saldo: " + listaClientes[i].saldo);
                }

                System.out.print("Digite o id do cliente para realizar o depósito: ");
                id_cliente = sc.nextInt();

                System.out.print("Digite o valor do depósito: ");
                valor = sc.nextDouble();

                listaClientes[id_cliente].depositar(valor);

                System.out.println("Depósito para " + listaClientes[id_cliente].nome + " realizado com sucesso!");
            }
            else if (opcao == 3){
                System.out.println("Lista de Clientes:");
                for (int i=0; i<id; i++) {
                    System.out.println("Id: " + i + " | Agencia: " + listaClientes[i].agencia + " | Conta: " + listaClientes[i].conta + " | Nome: " + listaClientes[i].nome + " | Saldo: " + listaClientes[i].saldo);
                }

                System.out.print("Digite o id do cliente para realizar o saque: ");
                id_cliente = sc.nextInt();

                System.out.print("Digite o valor do saque: ");
                valor = sc.nextDouble();

                if (valor <= listaClientes[id_cliente].saldo) {
                    listaClientes[id_cliente].sacar(valor);
                    System.out.println("Saque para " + listaClientes[id_cliente].nome + " realizado com sucesso!");
                }
                else
                    System.out.println("Saldo ($" + listaClientes[id_cliente].saldo + ") insuficiente para saque ($" + valor + ")!");
            }
            else if (opcao == 4){
                System.out.println("Lista de Clientes:");
                for (int i=0; i<id; i++) {
                    System.out.println("Id: " + i + " | Agencia: " + listaClientes[i].agencia + " | Conta: " + listaClientes[i].conta + " | Nome: " + listaClientes[i].nome + " | Saldo: " + listaClientes[i].saldo);
                }
            }
            else{
                break;
            }
        }
        sc.close();
    }
}
