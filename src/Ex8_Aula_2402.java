import java.util.Scanner;

public class Ex8_Aula_2402 {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        int a,b;

        System.out.print("Digite o primeiro número: ");
        a = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        b = sc.nextInt();

        if (a > b)
            System.out.print("Esse aqui é o maior número: " + a);
        else
            System.out.print("Esse aqui é o maior número: " + b);

        sc.close();
    }
}
