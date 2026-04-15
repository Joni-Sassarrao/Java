package Exemplo;

public class Pessoa {
    private int id;
    private String nome;
    private double saldo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id < 0)
            this.id = 0;
        else
            this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public Pessoa() {

    }

    public Pessoa(int id, String nome, double saldo) {
        this.id = id;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo += saldo;
    }

    public String getNomeFormatado() {
        return  this.id + " - " + this.nome;
    }
}
