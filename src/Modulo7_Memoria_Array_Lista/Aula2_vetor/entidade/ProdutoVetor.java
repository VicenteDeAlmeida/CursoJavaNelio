package Modulo7_Memoria_Array_Lista.Aula2_vetor.entidade;

public class ProdutoVetor {
    private String name;
    private double preco;

    public ProdutoVetor(String name, double preco) {
        this.name = name;
        this.preco = preco;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
