import java.util.Scanner;

public class Ex6_Aula_2002 {
    public static void main(String []Args) {
    Scanner sc = new Scanner(System.in);

    double d,r;

    System.out.print("Digite o número em Dolár: ");
    d = sc.nextDouble();

    r = d * 5.18;

    System.out.printf("A conversão de %.1f Dolar para real é: %.2f Reais", d, r);

    sc.close();
    }
}
