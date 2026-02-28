import java.util.Scanner;

public class Ex14_Aula_2702 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double p,a,r;
        String sexo;

        System.out.print("Qual é o seu sexo? (masculino/feminino): ");
        sexo = sc.next();

        System.out.print("Digite a sua altura: ");
        a = sc.nextDouble();

        System.out.print("Digite o seu peso: ");
        p = sc.nextDouble();

        r = p / (Math.pow(a, 2));

        if (sexo.equals("masculino")) {
            if (r < 20)
                System.out.printf("Você está abaixo do peso ideal %.2f", r);
            else if (r < 25)
                System.out.printf("Você está no peso ideal %.2f", r);
            else
                System.out.printf("Você está acima do peso ideal %.2f", r);
        }
        else if (sexo.equals("feminino")) {
            if (r < 19)
                System.out.printf("Você está abaixo do peso ideal %.2f", r);
            else if (r < 24)
                System.out.printf("Você está no peso ideal %.2f", r);
            else
                System.out.printf("Você está acima do peso ideal %.2f", r);
        }
        else
            System.out.print("Sexo inválido");

        sc.close();
    }
}
