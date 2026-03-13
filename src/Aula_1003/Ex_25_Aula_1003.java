package Aula_1003;

import java.util.Scanner;

public class Ex_25_Aula_1003 {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);

        int a,b,c,s;

        a = 1;
        b = 1;
        c = 1;

        for (int i = 1; i <20; i++) {
            s = a + b + c;
            System.out.println(s);

            a = b;
            b = c;
            c = s;
        }

        sc.close();
    }
}
