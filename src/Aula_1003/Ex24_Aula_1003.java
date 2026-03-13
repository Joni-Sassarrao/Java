package Aula_1003;

import java.util.Scanner;

public class Ex24_Aula_1003 {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);

        int fibonacci, a, b;
        a = 1;
        b = 0;

        for (int i = 1; i < 30; i++) {
            fibonacci = a + b;

            System.out.println(fibonacci);

            a = b;
            b = fibonacci;
        }

        sc.close();
    }
}
