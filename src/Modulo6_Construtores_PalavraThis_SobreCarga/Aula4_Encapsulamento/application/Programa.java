package Modulo6_Construtores_PalavraThis_SobreCarga.Aula4_Encapsulamento.application;

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
        Produto3 produto3 = new Produto3(nome, preco);
        produto3.setNome("Computador");
        System.out.println("Atualização Produto: " + produto3.getNome());
        produto3.setPreco(4500.0);
        System.out.println("Atualização do Preço do produto: " + produto3.getPreco());
        System.out.println("DADOS DO PRODUTO: " + produto3 + "\n");
        System.out.println("Digite o número de produtos que deseja adicionar ao estoque: ");
        int quantidade = sc.nextInt();
        produto3.adicionarProdutos(quantidade);
        System.out.println("DADOS ATUALIZADOS " + produto3 + "\n");
        System.out.println("Digite o número de produtos que deseja remover do estoque: ");
        quantidade = sc.nextInt();
        produto3.removerProdutos1(quantidade);
        System.out.println("DADOS ATUALIZADOS " + produto3);
        sc.close();
    }
}
