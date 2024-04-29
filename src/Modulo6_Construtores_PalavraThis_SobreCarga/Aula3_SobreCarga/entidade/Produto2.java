
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Modulo6_Construtores_PalavraThis_SobreCarga.Aula3_SobreCarga.entidade;

public class Produto2 {
    public String nome;
    public double preco;
    public int quantidade;

    public Produto2(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto2(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
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
