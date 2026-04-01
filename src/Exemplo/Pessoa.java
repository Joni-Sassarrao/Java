package Exemplo;

public class Pessoa {
    public int id;
    public String nome;
    public double saldo;

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
