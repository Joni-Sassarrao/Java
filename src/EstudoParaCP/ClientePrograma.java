package EstudoParaCP;

import java.util.Scanner;

public class ClientePrograma {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);

        Cliente[] clientes = new Cliente[10];

        int opcao, id = 0, id_cliente;
        String nome, agencia, conta;
        double valor;

        while(true) {
            System.out.println("==== Banco Master ====\n");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Emitir Saldo");
            System.out.println("5 - Sair");

            System.out.print("\nDigite a opção: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o nome do Cliente: ");
                nome = sc.next();

                System.out.print("Digite a agência do Cliente: ");
                agencia = sc.next();

                System.out.print("Digite a conta do Cliente: ");
                conta = sc.next();

                Cliente c = new Cliente(nome, agencia, conta);

                clientes[id] = c;
                id++;

                System.out.println("\nCliente Cadastrado\n");
            }
            else if (opcao == 2) {
                System.out.println("Lista de Clientes: ");
                for (int i = 0; i < id; i++) {
                    System.out.println("Id: " + i + " | Agência: " + clientes[i].getAgencia() + " | Conta: " + clientes[i].getConta() + " | Nome: " + clientes[i].getNome() + " | Saldo: " + clientes[i].getSaldo());
                }

                System.out.println("Digite o Id do Cliente para realizar o depósito: ");
                id_cliente = sc.nextInt();

                System.out.println("Digite o valor do depósito: ");
                valor = sc.nextDouble();

                clientes[id_cliente].depositar(valor);

                System.out.println("Depósito para " + clientes[id_cliente].getNome() + "realizado");
            }
            else if (opcao == 3) {
                System.out.println("Lista de Clientes: ");
                for (int i = 0; i < id; i++) {
                    System.out.println("Id: " + i + " | Agência: " + clientes[i].getAgencia() + " | Conta: " + clientes[i].getConta() + " | Nome: " + clientes[i].getNome() + " | Saldo: " + clientes[i].getSaldo());
                }

                System.out.println("Digite o Id do Cliente para realizar o saque: ");
                id_cliente = sc.nextInt();

                System.out.println("Digite o valor do saque: ");
                valor = sc.nextDouble();

                clientes[id_cliente].sacar(valor);

                if (valor <= clientes[id_cliente].getSaldo()) {
                    System.out.println("Saque para " + clientes[id_cliente].getNome() + " realizado");
                } else
                    System.out.println("Saldo ($" + clientes[id_cliente].getSaldo() + ") insuficiente");
            }
            else if (opcao == 4) {
                System.out.println("Lista de Clientes: ");
                for (int i = 0; i < id; i++) {
                    System.out.println("Id: " + i + " | Agência: " + clientes[i].getAgencia() + " | Conta: " + clientes[i].getConta() + " | Nome: " + clientes[i].getNome() + " | Saldo: " + clientes[i].getSaldo());
                }
            } else
                break;
        }
        sc.close();
    }
}
