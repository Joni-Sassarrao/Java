import java.util.Scanner;

public class Ex13_Aula_2402 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,c;

        System.out.print("Digite o primeiro valor: ");
        a = sc.nextInt();

        System.out.print("Digite o segundo valor: ");
        b = sc.nextInt();

        System.out.print("Digite o terceiro valor: ");
        c = sc.nextInt();

        if ((a + b > c) && (a + c > b) && (b + c > a))
            if ( (a == b) && (a == c) )
                System.out.print("Triângulo equilátero");
            else if ( (a != b) && (a != c) && (b != c))
                System.out.print("Triângulo escaleno");
            else
                System.out.print("Triângulo isósceles");
        else
            System.out.print("Não é um triângulo");

        sc.close();
    }
}
