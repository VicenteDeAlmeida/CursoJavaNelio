package Modulo10_Heranca_Polimorfismo.Aula7_Exercicio.entidades;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class ProdutoUsado extends Produto{

    LocalDate dataFabricacao;

    public ProdutoUsado(){
        super();
    }

    public ProdutoUsado(String nome, Double preco, LocalDate dataFabricacao) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }

    @Override

    public String etiquetaDePreco(){
        return getNome()
                + "(usado) $ "
                + String.format("%.2f",getPreco())
                + " Data de Fabricação: "
                + dataFabricacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

    }
}
