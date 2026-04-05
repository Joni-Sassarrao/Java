package Aula_0704;

public class programaClientes {
    public static void main(String[] Args) {
        clientes c1 = new clientes();

        c1.id = 1;
        c1.nome = "João";
        c1.idade = 19;
        c1.email = "random@email.com";

        clientes c2 = new clientes(2, "Pedro", 19, "random1@email.com");

        System.out.println(c1.getCliente());
        System.out.println(c2.getCliente());
    }
}
