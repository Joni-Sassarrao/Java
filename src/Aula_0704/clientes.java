package Aula_0704;

public class clientes {
    public String agencia;
    public String conta;
    public Double saldo;
    public String nome;

    public clientes() {

    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public double emitirSaldo() {
        return this.saldo;
    }
}
