import java.util.Scanner;


public class Ex21_Aula_0603 {


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int x, a, b, r;

        System.out.printf("Digite um número para obter a tabuada: ");
        x = ler.nextInt();

        while(x <= 0) {
            System.out.printf("Erro! Digite apenas números positivos!");
            System.out.printf("\nDigite um número para obter a tabuada: ");
            x = ler.nextInt();
        }

        System.out.printf("Digite o intervalo inicial da tabuada: ");
        a = ler.nextInt();

        System.out.printf("Digite o intervalo final da tabuada: ");
        b = ler.nextInt();

        while(b <= a) {
            System.out.printf("Erro! O intervalo final deve ser maior que o inicial!");
            System.out.printf("\nDigite o intervalo final da tabuada: ");
            b = ler.nextInt();
        }

        for(int i=b; i>=a; i--) {
            r = x * i;
            System.out.printf("%d X %d = %d\n", x, i, r);
        }

        ler.close();
    }
}
