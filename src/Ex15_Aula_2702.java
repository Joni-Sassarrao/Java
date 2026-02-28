import java.util.Scanner;

public class Ex15_Aula_2702 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, t, v0, v;

        System.out.print("Digite a aceleração (m/s): ");
        a = sc.nextDouble();

        System.out.print("Digite o velocidade inicial (m/s): ");
        v0 = sc.nextDouble();

        System.out.print("Digite o tempo (s): ");
        t = sc.nextDouble();

        v = (v0 + (a * t)) * 3.6;

        if (v <= 40)
            System.out.print("Veículo muito lento");
        else if (v <= 60)
            System.out.print("Velocidade permitida");
        else if (v <= 80)
            System.out.print("Velocidade de cruzeiro");
        else if (v <= 120)
            System.out.print("Veículo rápido");
        else
            System.out.print("Veículo muito rápido");

        sc.close();
    }
}
