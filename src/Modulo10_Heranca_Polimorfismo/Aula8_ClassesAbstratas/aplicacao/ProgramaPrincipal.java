/**
 * polimorfismo é o recurso que
 * permite que variáveis de um mesmo tipo mais genérico possam
 * apontar para objetos de tipos específicos diferentes, tendo assim
 * comportamentos diferentes conforme cada tipo específico
 * */

package Modulo10_Heranca_Polimorfismo.Aula8_ClassesAbstratas.aplicacao;

import Modulo10_Heranca_Polimorfismo.Aula8_ClassesAbstratas.entidades.Conta;
import Modulo10_Heranca_Polimorfismo.Aula8_ClassesAbstratas.entidades.ContaEmpresas;
import Modulo10_Heranca_Polimorfismo.Aula8_ClassesAbstratas.entidades.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        //Conta x = new Conta(1020,"Eu sou titular",1000.0); //Aqui não posso isntanciar a classe Conta pq ela é abstrata.Coloquei um abstract nela
        List<Conta> list = new ArrayList<>();
        list.add(new ContaPoupanca(1001, "Alex", 500.00, 0.01));
        list.add(new ContaEmpresas(1002, "Maria", 1500.00, 400.0));
        list.add(new ContaPoupanca(1001, "Bob", 800.00, 0.05));
        list.add(new ContaEmpresas(1004, "Marcelo", 2500.00, 800.0));

        /*Totalizar o saldo das contas:*/

        double soma = 0.0;
        for (Conta contas : list) {
            soma += contas.getSaldo();
        }
        System.out.printf("Total dos saldos das contas: %.2f", soma);

        /*Deposito nas contas*/

        for (Conta contass : list) {
            contass.deposito(10.0);
        }
        for (Conta dadosConta : list){
            System.out.println();
            System.out.printf("Atualização da conta: %d,%.2f.",dadosConta.getNumero(),dadosConta.getSaldo());
        }


    }
}

