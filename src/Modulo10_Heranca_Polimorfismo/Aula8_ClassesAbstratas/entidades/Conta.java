/**
 * São classes que não podem ser instanciadas
 * • É uma forma de garantir herança total: somente subclasses não
 * abstratas podem ser instanciadas, mas nunca a superclasse abstrata
 * Vantagens:
 * • Reuso
 * • Polimorfismo: a superclasse classe genérica nos permite tratar
 * de forma fácil e uniforme todos os tipos de conta, inclusive
 * com polimorfismo se for o caso (como fizemos nos últimos
 * exercícios). Por exemplo, você pode colocar todos tipos de
 * contas em uma mesma coleção.
 * Exemplos na classe ProgramaPrincipal
 * */

package Modulo10_Heranca_Polimorfismo.Aula8_ClassesAbstratas.entidades;

public abstract class Conta {
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
        this.saldo = this.saldo - (quantia + 5.0);
    }

    public void deposito(Double quantia) {
        this.saldo = this.saldo + quantia;
    }
}
