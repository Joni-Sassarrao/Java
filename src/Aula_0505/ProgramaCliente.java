package Aula_0505;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaCliente {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Cliente> clientes = new ArrayList<>();
        int opcao, id = 0, id_cliente, id_cliente_dest;
        String nome, agencia, conta;
        double valor;
        
        while(true) {
            System.out.println("\n=== Menu Java Banking ===\n");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Emitir Saldo");
            System.out.println("5 - Transferência");
            System.out.println("6 - Histórico");
            System.out.println("7 - Sair");

            System.out.print("\nDigite a opção desejada: ");
            opcao = sc.nextInt();
            
            if (opcao == 1) {
                System.out.print("\nDigite o nome do Cliente: ");
                nome = sc.next();

                System.out.print("Digite a agência do Cliente: ");
                agencia = sc.next();

                System.out.print("Digite a conta do Cliente: ");
                conta = sc.next();
                
                Cliente c = new Cliente(agencia, nome, conta);
                
                clientes.add(c);
                id++;

                System.out.println("\nCliente Cadastrado\n");
            } else if (opcao == 2) {
                System.out.println("\nLista de Clientes\n");
                for (Cliente c: clientes) {
                    System.out.println("Id: " + id + " | Agência: " + c.getAgencia() + " | Conta: " + c.getConta() + " | Nome: " + c.getNome() + " | Saldo: " + c.getSaldo() + " | Limite: " + c.getLimite());
                }

                System.out.print("\nDigite o Id do Cliente: ");
                id_cliente = sc.nextInt();

                System.out.print("Digite o valor do Depósito: ");
                valor = sc.nextDouble();
                
                Cliente c = clientes.get(id_cliente-1);
                c.depositar(valor);

                System.out.println("Depósito para " + c.getNome() + " realizado");
            } else if (opcao == 3) {
                System.out.println("\nLista de Clientes\n");
                for (Cliente c: clientes) {
                    System.out.println("Id: " + id + " | Agência: " + c.getAgencia() + " | Conta: " + c.getConta() + " | Nome: " + c.getNome() + " | Saldo: " + c.getSaldo() + " | Limite: " + c.getLimite());
                }

                System.out.print("\nDigite o Id do Cliente: ");
                id_cliente = sc.nextInt();

                System.out.print("Digite o valor do saque: ");
                valor = sc.nextDouble();
                
                Cliente c = clientes.get(id_cliente-1);
                
                if (valor <= (c.getSaldo() + (c.getLimite()))) {
                    c.sacar(valor);
                    System.out.println("Saque para: " + c.getNome() + " realizado");
                } else
                    System.out.println("Saldo ($" + c.getSaldo() + " e Limite ($" + c.getLimite() + ") insuficiente para saque ($" + valor + ")");
            } else if (opcao == 4) {
                System.out.println("\nLista de Clientes\n");
                for (Cliente c: clientes) {
                    System.out.println("Id: " + id + " | Agência: " + c.getAgencia() + " | Conta: " + c.getConta() + " | Nome: " + c.getNome() + " | Saldo: " + c.getSaldo() + " | Limite: " + c.getLimite());
                }
            } else if (opcao == 5) {
                System.out.println("\nLista de Clientes\n");
                for (Cliente c: clientes) {
                    System.out.println("Id: " + id + " | Agência: " + c.getAgencia() + " | Conta: " + c.getConta() + " | Nome: " + c.getNome() + " | Saldo: " + c.getSaldo() + " | Limite: " + c.getLimite());
                }

                System.out.print("\nDigite o Id do Cliente origem: ");
                id_cliente = sc.nextInt();

                System.out.print("Digite o Id do Cliente destino: ");
                id_cliente_dest = sc.nextInt();

                System.out.print("Digite o valor da transferência: ");
                valor = sc.nextDouble();

                Cliente c = clientes.get(id_cliente-1);
                Cliente cdest = clientes.get(id_cliente_dest-1);

                c.transferir(cdest, valor);

                System.out.println("Transferênca no valor de $" + valor + " de " + c.getNome() + " para " + cdest.getNome() + " realizdo");
            } else if (opcao == 6) {
                System.out.println("\nLista de Clientes\n");
                for (Cliente c: clientes) {
                    System.out.println("Id: " + id + " | Agência: " + c.getAgencia() + " | Conta: " + c.getConta() + " | Nome: " + c.getNome() + " | Saldo: " + c.getSaldo() + " | Limite: " + c.getLimite());
                }

                System.out.print("\nDigite o Id do Cliente para ter o extrato: ");
                id_cliente = sc.nextInt();

                Cliente c = clientes.get(id_cliente-1);
                System.out.println(c.getHistorico());
                System.out.println("Saldo: " + c.getSaldo());
            } else
                break;
        }
        sc.close();
    }
}
