package Modulo10_Heranca_Polimorfismo.Aula10_Exercicio.entidades;

public abstract class Contribuinte {
    private String nome;

    private Double rendaAnual;

    public Contribuinte(){

    }

    public Contribuinte(String nome, Double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }
   public abstract double imposto();

    public String taxasPagas(){
        return nome
                + ": $"
                + String.format("%.2f",imposto());
    }
}
