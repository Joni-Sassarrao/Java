import java.util.Scanner;

public class Ex5_Aula_2002 {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);

        double temperaturaC, temperaturaF;

        System.out.print("Digite a temperatura: ");
        temperaturaC = sc.nextDouble();

        temperaturaF = (temperaturaC * 1.8) + 32;

        System.out.printf("A temperatura %.1fºC para Fahrenheit é: %.1fºF", temperaturaC, temperaturaF);

        sc.close();
    }

}
