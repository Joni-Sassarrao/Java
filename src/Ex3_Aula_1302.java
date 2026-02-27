import java.util.Scanner;

public class Ex3_Aula_1302 {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);

        double a,b,r;

        System.out.print("Digite a base do triâgulo: ");
        b = sc.nextDouble();

        System.out.print("Digite a altura do triângulo: ");
        a = sc.nextDouble();

        r = (a * b) / 2;

        System.out.printf("A área do triâgulo é: %.2f", r);

        sc.close();
    }
}
