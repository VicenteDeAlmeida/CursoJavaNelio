//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Modulo10_Heranca_Polimorfismo.Aula4_ClassesEMetodosFinal.entidades;

public class ContaPoupanca extends Conta {
    private Double taxaDeJuro;

    public ContaPoupanca() {
    }

    public ContaPoupanca(Integer numero, String titular, Double saldo, Double taxaDeJuro) {
        super(numero, titular, saldo);
        this.taxaDeJuro = taxaDeJuro;
    }

    public Double getTaxaDeJuro() {
        return this.taxaDeJuro;
    }

    public void setTaxaDeJuro(Double taxaDeJuro) {
        this.taxaDeJuro = taxaDeJuro;
    }

    public void atualizaSaldo() {
        this.saldo = this.saldo + this.saldo * this.taxaDeJuro;
    }

    public void saque(Double quantia) {
        this.saldo = this.saldo - quantia;
    }
}
