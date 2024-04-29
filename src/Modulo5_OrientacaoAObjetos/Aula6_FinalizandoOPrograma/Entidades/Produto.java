//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Modulo5_OrientacaoAObjetos.Aula6_FinalizandoOPrograma.Entidades;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public Produto() {
    }

    public double valorTotalEstoque() {
        return (double)this.quantidade * this.preco;
    }

    public void adiconarProdutos(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        String var10000 = this.nome;
        return "NOME: " + var10000 + ", PREÇO: $ " + String.format("%.2f", this.preco) + ", QUANTIDADE: " + this.quantidade + " unidades,TOTAL: $" + String.format("%.2f", this.valorTotalEstoque());
    }
}
