//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Modulo10_Heranca_Polimorfismo.Aula3_Sobreposicao_PalavraSuper_Override.entidades;

public class ContaEmpresas extends Conta {
    private Double limiteEmprestimo;

    public ContaEmpresas() {
    }

    public ContaEmpresas(Integer numero, String titular, Double saldo, Double limiteEmprestimo) {
        super(numero, titular, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return this.limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void emprestimo(Double quantia) {
        if (quantia <= this.limiteEmprestimo) {
            this.saldo = this.saldo + (quantia - 10.0);
        }

    }

    public void saque(Double quantia) {
        super.saque(quantia);
        this.saldo = this.saldo - 2.0;
    }
}
