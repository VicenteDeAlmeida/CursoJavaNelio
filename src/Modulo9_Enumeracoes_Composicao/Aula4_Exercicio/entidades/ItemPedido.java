//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Modulo9_Enumeracoes_Composicao.Aula4_Exercicio.entidades;

public class ItemPedido {
    private Integer quantidade;
    private Double preco;
    private Produto produto;

    public ItemPedido() {
    }

    public ItemPedido(Integer quantidade, Double preco, Produto produto) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return this.preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double subTotal() {
        return this.preco * (double)this.quantidade;
    }

    public String toString() {
        String var10000 = this.getProduto().getNome();
        return var10000 + ", $" + String.format("%.2f", this.preco) + ", Quantidade: " + this.quantidade + ", Subtotal: $" + String.format("%.2f", this.subTotal());
    }
}
