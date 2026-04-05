package Aula_0704;

public class clientes {
    public int id;
    public String nome;
    public int idade;
    public String email;

    public clientes() {

    }

    public clientes(int id, String nome, int idade, String email) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public String getCliente() {
        return "ID " + this.id + " | " + this.nome + " | Idade " + this.idade + " | " + this.email;
    }
}
