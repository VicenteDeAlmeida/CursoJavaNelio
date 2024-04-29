package Modulo10_Heranca_Polimorfismo.Aula6_Exercicio.entidades;

public class Funcionario {

    String nome;
    Integer horas;

    Double valorPorHoras;

    public Funcionario(){


    }

    public Funcionario(String nome, Integer horas, Double valorPorHoras) {
        this.nome = nome;
        this.horas = horas;
        this.valorPorHoras = valorPorHoras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Double getValorPorHoras() {
        return valorPorHoras;
    }

    public void setValorPorHoras(Double valorPorHoras) {
        this.valorPorHoras = valorPorHoras;
    }

    public Double pagamento(){
        return valorPorHoras * horas;
    }
}
