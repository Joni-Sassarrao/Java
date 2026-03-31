package Aula_2703;

import java.util.Scanner;

public class alunos_cadastrados {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);

        alunos[] listaAlunos = new alunos[5];

        for (int i = 0; i < 2; i++) {
            alunos alu = new alunos();

            System.out.print("\nDigite seu RA: ");
            alu.ra = sc.next();

            System.out.print("Digite seu nome: ");
            alu.nome = sc.next();

            alu.materias = new String[6];
            for (int j = 0; j < 6; j++) {
                System.out.print("Digite as siglas das suas materias preferidas: ");
                alu.materias[j] = sc.next();
            }

            System.out.print("Digite o período que você está estudando (noite/manha): ");
            alu.periodo = sc.next();

            listaAlunos[i] = alu;
        }

        System.out.println("\nAlunos que estudam de noite: ");

        for (int i = 0; i < 2; i++) {
            if (listaAlunos[i].periodo.equals("noite")) {
                System.out.println("\nRA do aluno: " + listaAlunos[i].ra);
                System.out.println("Nome do aluno: " + listaAlunos[i].nome);
                System.out.println("Período que o aluno estuda: " + listaAlunos[i].periodo + "\n");
            }
        }

        sc.close();
    }
}
