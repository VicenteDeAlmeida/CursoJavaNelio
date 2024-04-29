package Modulo6_Construtores_PalavraThis_SobreCarga.Aula4_Encapsulamento.entidade;

public class Produto3 {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto3(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto3(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public double valorTotalEstoque() {
        return (double)this.quantidade * this.preco;
    }

    public void adicionarProdutos(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerProdutos1(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        String var10000 = this.nome;
        return "NOME: " + var10000 + ", PREÇO: $ " + String.format("%.2f", this.preco) + ", QUANTIDADE: " + this.quantidade + " unidades,TOTAL: $" + String.format("%.2f", this.valorTotalEstoque());
    }
}

