import java.util.Scanner;

public class Ex12_Aula_2402 {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);

        double p,a,r;

        System.out.print("Digite a sua altura: ");
        a = sc.nextDouble();

        System.out.print("Digite o seu peso: ");
        p = sc.nextDouble();

        //r = p / (a * a);
        r  = p / (Math.pow(a, 2));

        if (r < 20)
            System.out.printf("Você está abaixo do peso ideal: %.2f", r);
        else if (r < 25)
            System.out.printf("Você está com o peso ideal: %.2f", r);
        else
            System.out.printf("Você está acima do peso ideal %.2f", r);

        sc.close();
    }
}
