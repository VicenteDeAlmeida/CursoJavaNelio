package Modulo5_OrientacaoAObjetos.Aula4_OutroExemplo.Aplicacao;

import Modulo5_OrientacaoAObjetos.Aula4_OutroExemplo.Entidades.Produto;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public Programa() {
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();
        System.out.println("Vamos começar:Digite o nome do produto!");
        produto.nome = sc.nextLine();
        System.out.println("Digite o preço do produto:");
        produto.preco = sc.nextDouble();
        System.out.println("Digite a quantidade do produto em estoque:");
        produto.quantidade = sc.nextInt();
        System.out.printf("Informações do produto: NOME: %s,PREÇO: %.2f,QUANTIDADE EM ESTOQUE: %d.TOTAL: %.2f", produto.nome, produto.preco, produto.quantidade, produto.valorTotalEstoque());
        sc.close();
    }
}
