import java.util.Scanner;

public class Ex7_Aula_2002 {
    public static void main(String []Args) {
    Scanner sc = new Scanner(System.in);

    double produto1,produto2,produto3,produto4,produto5,resultado,pagar,troco;

    System.out.print("Digite o valor do primeiro produto: ");
    produto1 = sc.nextDouble();

    System.out.print("Digite o valor do segundo produto: ");
    produto2 = sc.nextDouble();

    System.out.print("Digite o valor do terceiro produto: ");
    produto3 = sc.nextDouble();

    System.out.print("Digite o valor do quarto produto: ");
    produto4 = sc.nextDouble();

    System.out.print("Digite o valor do quinto produto: ");
    produto5 = sc.nextDouble();

    resultado = produto1 + produto2 + produto3 + produto4 + produto5;

    System.out.print("Digite o valor de quanto você vai pagar: ");
    pagar = sc.nextDouble();

    troco = pagar - resultado;

    System.out.printf("Você pagou %.1f reais e recebeu de troco %.1f reais", pagar, troco);

    sc.close();
    }
}
