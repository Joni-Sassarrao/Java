import java.util.Scanner;

public class Ex11_Aula_2402 {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);

        double a,b,area;

        System.out.print("Digite a base do triângulo: ");
        b = sc.nextDouble();

        System.out.print("Digite a altura do triângulo: ");
        a = sc.nextDouble();

        area = (b * a) / 2;

        System.out.print("A área do triângulo é: " + area);

        if (area > 100)
            System.out.print("\nTerreno grande");

        sc.close();
    }
}
