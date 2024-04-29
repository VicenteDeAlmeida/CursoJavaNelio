//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Modulo10_Heranca_Polimorfismo.Aula2_UpCastingEDownCasting.aplicacao;

import Modulo10_Heranca_Polimorfismo.Aula2_UpCastingEDownCasting.entidades.Conta;
import Modulo10_Heranca_Polimorfismo.Aula2_UpCastingEDownCasting.entidades.ContaEmpresas;
import Modulo10_Heranca_Polimorfismo.Aula2_UpCastingEDownCasting.entidades.ContaPoupanca;

public class ProgramaPrincipal {
    public ProgramaPrincipal() {
    }

    public static void main(String[] args) {
        new Conta(1001, "Alex", 0.0);
        ContaEmpresas contaEmpresas = new ContaEmpresas(1002, "Maria", 0.0, 500.0);
        Conta conta2 = new ContaEmpresas(1003, "Mario", 0.0, 5000.0);
        Conta conta3 = new ContaPoupanca(1004, "Anna", 0.0, 0.01);
        ContaEmpresas conta4 = (ContaEmpresas)conta2;
        conta4.emprestimo(100.0);
        if (conta3 instanceof ContaEmpresas conta5) {
            conta5.emprestimo(200.0);
            System.out.println("Empréstimo");
        }

        if (conta3 instanceof ContaPoupanca conta5) {
            conta5.atualizaSaldo();
            System.out.println("Atualizado o saldo");
        }

    }
}
