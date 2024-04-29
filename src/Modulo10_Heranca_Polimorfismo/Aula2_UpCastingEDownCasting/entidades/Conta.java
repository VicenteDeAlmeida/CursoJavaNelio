//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Modulo10_Heranca_Polimorfismo.Aula2_UpCastingEDownCasting.entidades;

public class Conta {
    private Integer numero;
    private String titular;
    protected Double saldo;

    public Conta() {
    }

    public Conta(Integer numero, String titular, Double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public void saque(Double quantia) {
        this.saldo = this.saldo - quantia;
    }

    public void deposito(Double quantia) {
        this.saldo = this.saldo + quantia;
    }
}
