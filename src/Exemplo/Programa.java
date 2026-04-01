package Exemplo;

public class Programa {
    public static void main(String[] Args) {
        Pessoa p1 = new Pessoa();

        p1.id = 1;
        p1.nome = "Leandrinho";
        p1.saldo = 0;

        Pessoa p2 = new Pessoa(2, "Bruno", 10);

        p1.depositar(10);
        p2.depositar(30);

        System.out.println(p1.getNomeFormatado());
    }
}
