//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Modulo5_OrientacaoAObjetos.Aula5_ObjectEToString.Aplicacao;

import Modulo5_OrientacaoAObjetos.Aula5_ObjectEToString.Entidades.Produto;
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
        System.out.println("DADOS DO PRODUTO: " + produto);
        sc.close();
    }
}
