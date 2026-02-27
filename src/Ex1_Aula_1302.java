import java.util.Scanner;

public class Ex1_Aula_1302 {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);

        int a,b,r;

        System.out.print("Digite a base do retângulo: ");
        b = sc.nextInt();

        System.out.print("Digite a altura do retângulo número: ");
        a = sc.nextInt();

        r = b * a;

        System.out.print("A área do retângulo é: " + r);

        sc.close();
    }
}