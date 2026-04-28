package EstudoParaCP;

public class Loja {
    private String nome;
    private int codigo;
    private double preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public Loja() {

    }

    public Loja(int codigo, String nome, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = 0;
    }

    public void adicionarEstoque(int qtnd) {
        if (qtnd > 0) {
            this.quantidade += qtnd;
            System.out.println("Produto Adicionado");
        } else
            System.out.println("Erro: O valor deve ser positivo");
    }

    public void retirarEstoque(int qtnd) {
        if (qtnd > 0 && qtnd <= this.quantidade) {
            this.quantidade -= qtnd;
        } else
            System.out.println("Erro: O valor inválido");
    }

    public void consultar() {
        System.out.println("Código do produto: " + this.codigo + " | Nome: " + this.nome + " | Preço: " + this.preco + " | Quantidade: " + this.quantidade);
    }

}
