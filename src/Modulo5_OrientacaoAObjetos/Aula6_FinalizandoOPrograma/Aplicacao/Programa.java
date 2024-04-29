

package Modulo5_OrientacaoAObjetos.Aula6_FinalizandoOPrograma.Aplicacao;

import Modulo5_OrientacaoAObjetos.Aula6_FinalizandoOPrograma.Entidades.Produto;
import java.util.Locale;
import java.util.Scanner;

public class Programa {


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
        System.out.println("DADOS DO PRODUTO: " + produto + "\n");
        System.out.println("Digite o número de produtos que deseja adicionar ao estoque: ");
        int quantidade = sc.nextInt();
        produto.adiconarProdutos(quantidade);
        System.out.println("DADOS ATUALIZADOS " + produto + "\n");
        System.out.println("Digite o número de produtos que deseja remover do estoque: ");
        quantidade = sc.nextInt();
        produto.removerProdutos(quantidade);
        System.out.println("DADOS ATUALIZADOS " + produto);
        sc.close();
    }
}
