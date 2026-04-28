package EstudoParaCP;

public class Cliente {
    private String agencia;
    private String conta;
    private double saldo;
    private String nome;
    private double limite;
    private String historico;

    public double getLimite() {
        return limite;
    }

    public String getHistorico() {
        return historico;
    }

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

    public Cliente() {
        this.saldo = 0;
        this.limite = 50;
        this.historico = "";
    }

    public Cliente(String agencia, String conta, String nome) {
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = 0;
        this.nome = nome;
        this.historico = "";
        this.limite = 50;
    }

    public void depositar(double valorDeposito) {
        this.saldo += valorDeposito;
        this.historico += "- $" + valorDeposito + "\n";
    }

    public void sacar(double valorSaque) {
        this.saldo -= valorSaque;
        this.historico += "- $" + valorSaque + "\n";
    }

    public double emitirSaldo() {
        return this.saldo;
    }

    public void transferir(Cliente clienteDestino, double valorTransferencia) {
        this.sacar(valorTransferencia);
        clienteDestino.depositar(valorTransferencia);
    }
}
