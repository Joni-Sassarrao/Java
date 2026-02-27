import java.util.Scanner;

public class Ex2_Aula_1302 {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);

        int lado,r;

        System.out.print("Digite o lado do quadrado: ");
        lado = sc.nextInt();

        r = lado * lado;

        System.out.print("A área do quadrado é: " + r);

        sc.close();
    }
}