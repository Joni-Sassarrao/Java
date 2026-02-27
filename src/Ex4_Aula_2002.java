import java.util.Scanner;

public class Ex4_Aula_2002 {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);

        double a,b,c,d,m;

        System.out.print("Digite o primeiro número: ");
        a = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        b = sc.nextDouble();

        System.out.print("Digite o terceiro número: ");
        c = sc.nextDouble();

        System.out.print("Digite o quarto número: ");
        d = sc.nextDouble();

        m = (a+b+c+d) / 4;

        System.out.printf("A média aritmética dos números é: %.1f", m);

        sc.close();
    }
}
