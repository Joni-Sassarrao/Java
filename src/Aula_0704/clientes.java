package Aula_0704;

public class clientes {
    public String agencia;
    public String conta;
    public double saldo;
    public String nome;

    public clientes(){

    }

    public clientes(String agencia, String conta, double saldo, String nome) {
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
        this.nome = nome;
    }

    public void depositar(double valorDeposito){
        this.saldo += valorDeposito;
    }

    public void sacar(double valorSaque){
        this.saldo -= valorSaque;
    }

    public double emitirSaldo(){
        return this.saldo;
    }

}
