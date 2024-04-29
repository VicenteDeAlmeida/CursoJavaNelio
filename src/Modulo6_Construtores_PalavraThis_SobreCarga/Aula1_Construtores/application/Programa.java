

package Modulo6_Construtores_PalavraThis_SobreCarga.Aula1_Construtores.application;

import Modulo6_Construtores_PalavraThis_SobreCarga.Aula4_Encapsulamento.entidade.Produto3;

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
        System.out.println("Digite a quantidade do produto em estoque:");
        int quantidade = sc.nextInt();
        Produto3 produto1 = new Produto3(nome, preco, quantidade);
        System.out.println("DADOS DO PRODUTO: " + produto1 + "\n");
        System.out.println("Digite o número de produtos que deseja adicionar ao estoque: ");
        quantidade = sc.nextInt();
        produto1.adicionarProdutos(quantidade);
        System.out.println("DADOS ATUALIZADOS " + produto1 + "\n");
        System.out.println("Digite o número de produtos que deseja remover do estoque: ");
        quantidade = sc.nextInt();
        produto1.removerProdutos1(quantidade);
        System.out.println("DADOS ATUALIZADOS " + produto1);
        sc.close();
    }
}
