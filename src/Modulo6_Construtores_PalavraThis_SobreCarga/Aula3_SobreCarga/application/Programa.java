//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Modulo6_Construtores_PalavraThis_SobreCarga.Aula3_SobreCarga.application;

import Modulo6_Construtores_PalavraThis_SobreCarga.Aula3_SobreCarga.entidade.Produto2;

import java.util.Locale;
import java.util.Scanner;

public class Programa {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos começar:Digite o nome do produto!");
        String nome = sc.nextLine();
        System.out.println("Digite o preço do produto:");
        double preco = sc.nextDouble();
        Produto2 produto2 = new Produto2(nome, preco);
        System.out.println("DADOS DO PRODUTO: " + produto2 + "\n");
        System.out.println("Digite o número de produtos que deseja adicionar ao estoque: ");
        int quantidade = sc.nextInt();
        produto2.adicionarProdutos(quantidade);
        System.out.println("DADOS ATUALIZADOS " + produto2 + "\n");
        System.out.println("Digite o número de produtos que deseja remover do estoque: ");
        quantidade = sc.nextInt();
        produto2.removerProdutos1(quantidade);
        System.out.println("DADOS ATUALIZADOS " + produto2);
        sc.close();
    }
}
