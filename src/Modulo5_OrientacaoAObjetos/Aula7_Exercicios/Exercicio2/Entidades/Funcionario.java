package Modulo5_OrientacaoAObjetos.Aula7_Exercicios.Exercicio2.Entidades;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double imposto;

    public Funcionario() {
    }

    public double salarioLiquido() {
        return this.salarioBruto - this.imposto;
    }

    public void incrementoSalario(double porcentagem) {
        this.salarioBruto += this.salarioBruto * porcentagem / 100.0;
    }

    public String toString() {
        String var10000 = this.nome;
        return "DADOS ATUALIZADOS: " + var10000 + ", $ " + String.format("%.2f", this.salarioLiquido());
    }
}
