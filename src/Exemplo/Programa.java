package Exemplo;

public class Programa {
    public static void main(String[] Args) {
        Pessoa p1 = new Pessoa();

        p1.setId(-8);
        p1.setNome("Leandrinho");
        p1.depositar(10);

        System.out.print(p1.getNome());
        System.out.print(p1.getId());

        //Pessoa p2 = new Pessoa(2, "Bruno", 10);

        //p1.depositar(10);
        //p2.depositar(30);

        //System.out.println(p1.getNomeFormatado());
    }
}
