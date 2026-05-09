package Aula_0505;

public class Produto {
    private int codigo;
    private String nome;
    private double preco;
    private int quantidade;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Produto() {

    }

    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;
    }

    public void entradaProd(int qtn) {
        if (qtn > 0) {
            this.quantidade += qtn;
            System.out.println("Entrada do Produto: " + this.nome + " realizado");
        } else
            System.out.println("Erro! Valor Inválido");
    }

    public void vendaProd(int qtn) {
        if (qtn > 0 && qtn < this.quantidade) {
            this.quantidade -= qtn;
            System.out.println("Venda do Produto: " + this.nome + " realizado");
        } else
            System.out.println("Erro! Valor Inválido");
    }

    public void consulta() {
        System.out.println("Código do Produto: " + this.codigo + " | Nome do Produto: " + this.nome + " | Preço do Produto: " + this.preco + " | Quantidade do Produto no Estoque: " + this.quantidade);
    }
}
