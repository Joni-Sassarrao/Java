package Aula_0603;

import java.util.Scanner;

public class Ex22_Aula_0603 {
    public static void main(String[] String) {
        Scanner sc = new Scanner(System.in);

        int t;

        for(int num = 1; num <= 20; num++) {
            for (int i=1; i<=10; i++) {
                t = num * i;
                System.out.printf("%d X %d = %d\n", num, i, t);
            }
            System.out.println("Pressione Enter para continuar...");
            sc.nextLine();
        }
        sc.close();
    }
}
