//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Modulo6_Construtores_PalavraThis_SobreCarga.Aula7_Exercicio.aplicacao;

import Modulo6_Construtores_PalavraThis_SobreCarga.Aula7_Exercicio.entidade.ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaConta {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número da conta!");
        int numeroConta = sc.nextInt();
        System.out.println("Digite o nome do cliente!");
        String nomeTitular = sc.next();
        System.out.println("Você deseja fazer um depósito inicial?y/n");
        String resposta = sc.next();
        ContaBancaria contaBancaria;
        double valorDeposito;
        if (resposta.equals("y")) {
            System.out.println("Digite o valor do deposito incial!");
            valorDeposito = sc.nextDouble();
            contaBancaria = new ContaBancaria(numeroConta, nomeTitular, valorDeposito);
        } else {
            contaBancaria = new ContaBancaria(numeroConta, nomeTitular);
        }

        System.out.println();
        System.out.println("Dados da conta:");
        System.out.println(contaBancaria);
        System.out.println("Insira um valor para depósito:");
        valorDeposito = sc.nextDouble();
        contaBancaria.deposito(valorDeposito);
        System.out.println("Atualização da conta bancária");
        System.out.println(contaBancaria);
        System.out.println("Insira um valor para saque:");
        double valorSaque = sc.nextDouble();
        contaBancaria.saque(valorSaque);
        System.out.println("Atualização da conta bancária");
        System.out.println(contaBancaria);
        sc.close();
    }
}
