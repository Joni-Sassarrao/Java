package Aula_0704;

import java.util.Scanner;

public class programaClientes {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        clientes c = new clientes();

        int mostrar = 0;

        while (mostrar != 5) {
            System.out.println("\n1 - Cadastrar cliente");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar Saldo");
            System.out.println("4 - Emitir Saldo");
            System.out.println("5 - Sair");
            System.out.print("Digite o número: ");
            mostrar = sc.nextInt();

            while (mostrar > 5) {
                System.out.println("\nErro! Digite apenas os números da opção abaixo: \n");
                System.out.println("1 - Cadastrar cliente");
                System.out.println("2 - Depositar");
                System.out.println("3 - Sacar Saldo");
                System.out.println("4 - Emitir Saldo");
                System.out.println("5 - Sair");
                System.out.print("Digite o número: ");
                mostrar = sc.nextInt();
            }

            if (mostrar == 1) {
                System.out.print("Digite sua agência: ");
                c.agencia = sc.next();

                System.out.print("Digite o nome da sua conta: ");
                c.conta = sc.next();

                System.out.print("Digite o seu saldo: ");
                c.saldo = sc.nextDouble();

                System.out.print("Digite o seu nome: ");
                c.nome = sc.next();
            } else if (mostrar == 2) {
                System.out.print("Digite o quanto você quer depositar na sua conta: ");
                c.depositar(sc.nextDouble());
            } else if (mostrar == 3) {
                System.out.print("Digite o quanto você quer sacar da sua conta: ");
                c.sacar(sc.nextDouble());
            } else if (mostrar == 4) {
                System.out.println(c.emitirSaldo());
            } else
                System.out.print("Saindo...");
        }

        sc.close();
    }
}
