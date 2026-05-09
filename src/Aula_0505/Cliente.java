package Aula_0505;

public class Cliente {
    private String agencia;
    private String conta;
    private double saldo;
    private String nome;
    private double limite;
    private String historico;

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getLimite() {
        return limite;
    }

    public String getHistorico() {
        return historico;
    }
    
    public Cliente() {
        this.saldo = 0;
        this.limite = 50;
        this.historico = "";
    }
    
    public Cliente(String agencia, String conta, String nome) {
        this.agencia = agencia;
        this.conta = conta;
        this.nome = nome;
        this.saldo = 0;
        this.limite = 50;
        this.historico = "";
    }
    
    public void depositar(double valorDepositado) {
        this.saldo += valorDepositado;
        this.historico = this.historico + "+ $" + valorDepositado + "\n";
    }
    
    public void sacar(double valorSaque) {
        this.saldo -= valorSaque;
        this.historico = this.historico + "- $" + valorSaque + "\n";
    }
    
    public void transferir(Cliente clienteDestino, double valorTrasferencia) {
        this.sacar(valorTrasferencia);
        clienteDestino.depositar(valorTrasferencia);
    }
}
