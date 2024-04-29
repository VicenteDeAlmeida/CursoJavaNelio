//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Modulo10_Heranca_Polimorfismo.Aula4_ClassesEMetodosFinal.aplicacao;

import Modulo10_Heranca_Polimorfismo.Aula3_Sobreposicao_PalavraSuper_Override.entidades.Conta;
import Modulo10_Heranca_Polimorfismo.Aula3_Sobreposicao_PalavraSuper_Override.entidades.ContaEmpresas;
import Modulo10_Heranca_Polimorfismo.Aula3_Sobreposicao_PalavraSuper_Override.entidades.ContaPoupanca;

public class ProgramaPrincipal {
    public ProgramaPrincipal() {
    }

    public static void main(String[] args) {
        Conta conta1 = new Conta(1001, "Alex", 1000.0);
        conta1.saque(200.0);
        System.out.println(conta1.getSaldo());
        Conta conta2 = new ContaPoupanca(1002, "Maria", 1000.0, 0.01);
        conta2.saque(200.0);
        System.out.println(conta2.getSaldo());
        Conta conta3 = new ContaEmpresas(1003, "Bob", 1000.0, 500.0);
        conta3.saque(200.0);
        System.out.println(conta3.getSaldo());
    }
}
