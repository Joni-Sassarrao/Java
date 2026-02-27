import java.util.Scanner;

public class Ex10_Aula_2402 {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);

        double a,b;

        System.out.print("Digite o primeiro número: ");
        a = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        b = sc.nextDouble();

        if (a > b)
            System.out.print("Esse aqui é o maior número: " + a);
        else if (a == b)
            System.out.print("Os números são iguais");
        else
            System.out.print("Esse é o maior número: " + b);

        sc.close();
    }
}
