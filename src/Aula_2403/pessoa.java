package Aula_2403;

import java.util.Scanner;

public class pessoa {
    public static void main(String[] Args) {
        Scanner sc =  new Scanner(System.in);

        cliente[] listaClientes = new cliente[5];

        for (int i = 0; i < 2; i++) {
            cliente c = new cliente();

            c.id = i;

            System.out.print("Digite seu nome: ");
            c.nome = sc.next();

            System.out.print("Digite sua idade ");
            c.idade = sc.nextInt();

            System.out.print("Digite seu e-mail: ");
            c.email = sc.next();

            listaClientes[i] = c;
        }

        for (int i = 0; i < 2; i++) {
            System.out.printf("\nId do usuário: " + listaClientes[i].id);
            System.out.printf("\nNome do usuário: " + listaClientes[i].nome);
            System.out.printf("\nIdade do usuário: " + listaClientes[i].idade);
            System.out.printf("\nE-mail do usuário: " + listaClientes[i].email);
        }

        sc.close();
    }
}
