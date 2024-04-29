package Modulo10_Heranca_Polimorfismo.Aula7_Exercicio.aplicacao;

import Modulo10_Heranca_Polimorfismo.Aula7_Exercicio.entidades.Produto;
import Modulo10_Heranca_Polimorfismo.Aula7_Exercicio.entidades.ProdutoImportado;
import Modulo10_Heranca_Polimorfismo.Aula7_Exercicio.entidades.ProdutoUsado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Executora {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Produto> produtoList = new ArrayList<>();
        System.out.print("Digite o número de produtos: ");
        int numeroDeProdutos = sc.nextInt();
        for (int i = 1 ; i<=numeroDeProdutos;i++){
            System.out.println("Digite os dados do produto " + i + ":");
            System.out.print("Comum,usado,ou importado? ");
            String tipoProduto = sc.next();
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Preço: ");
            Double preco = sc.nextDouble();
            if (tipoProduto.equalsIgnoreCase("Comum")){
                produtoList.add(new Produto(nome,preco));
            } else if (tipoProduto.equalsIgnoreCase("Usado")) {
                System.out.print("Data de Fabricação:(DD/MM/YYYY): ");
                LocalDate data = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                produtoList.add(new ProdutoUsado(nome,preco,data));

            }else {
                System.out.print("Taxa da Alfandega: ");
                Double taxaAlfandega = sc.nextDouble();
                produtoList.add(new ProdutoImportado(nome,preco,taxaAlfandega));
            }
        }
        System.out.println("Etiquetas de Preço: ");

        for (Produto prod : produtoList){
            System.out.println(prod.etiquetaDePreco());
        }
        sc.close();
    }
}
