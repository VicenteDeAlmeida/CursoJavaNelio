package Modulo10_Heranca_Polimorfismo.Aula7_Exercicio.entidades;

public class ProdutoImportado extends Produto {
    Double taxaAlfandega;

    public ProdutoImportado(){
        super();
    }

    public ProdutoImportado(String nome, Double preco, Double taxaAlfandega) {
        super(nome, preco);
        this.taxaAlfandega = taxaAlfandega;
    }

    public Double getTaxaAlfandega() {
        return taxaAlfandega;
    }

    public void setTaxaAlfandega(Double taxaAlfandega) {
        this.taxaAlfandega = taxaAlfandega;
    }

    public Double precoTotal(){
        return preco + taxaAlfandega;
    }

    @Override

    public String etiquetaDePreco(){
        return getNome()
                + " $ "
                + String.format("%.2f", precoTotal())
                + " (Taxa da Alfandega: $ "
                + String.format("%.2f", taxaAlfandega)
                + ")";

    }
}
