//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Modulo6_Construtores_PalavraThis_SobreCarga.Aula7_Exercicio.entidade;

public class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private double depositoInicial;

    public ContaBancaria(int numeroConta, String nomeTitular, double depositoInicial2) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.deposito(depositoInicial2);
    }

    public ContaBancaria(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public double getNumeroConta() {
        return (double)this.numeroConta;
    }

    public String getNomeTitular() {
        return this.nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getDepositoInicial() {
        return this.depositoInicial;
    }

    public void DepositoInicial(double depositoInicial) {
        this.depositoInicial = depositoInicial;
    }

    public void deposito(double quantia) {
        this.depositoInicial += quantia;
    }

    public void saque(double quantia) {
        this.depositoInicial -= quantia + 5.0;
    }

    public String toString() {
        int var10000 = this.numeroConta;
        return "Conta: " + var10000 + " ,Cliente: " + this.nomeTitular + " ,Saldo:" + String.format("%.2f", this.depositoInicial);
    }
}
