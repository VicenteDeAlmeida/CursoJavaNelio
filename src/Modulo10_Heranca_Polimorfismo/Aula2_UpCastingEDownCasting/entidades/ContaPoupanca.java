
package Modulo10_Heranca_Polimorfismo.Aula2_UpCastingEDownCasting.entidades;

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
}
