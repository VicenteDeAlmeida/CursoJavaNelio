//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Modulo9_Enumeracoes_Composicao.Aula4_Exercicio.aplicacao;

import Modulo9_Enumeracoes_Composicao.Aula4_Exercicio.entidades.Cliente;
import Modulo9_Enumeracoes_Composicao.Aula4_Exercicio.entidades.ItemPedido;
import Modulo9_Enumeracoes_Composicao.Aula4_Exercicio.entidades.Pedido;
import Modulo9_Enumeracoes_Composicao.Aula4_Exercicio.entidades.Produto;
import Modulo9_Enumeracoes_Composicao.Aula4_Exercicio.entidades.enums.StatusPedido;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ProgramaTeste {
    public ProgramaTeste() {
    }

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Entre com os dados do cliente");
        System.out.println("Digite o nome do cliente:");
        String nome = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.next();
        System.out.println("Data de aniversário:");
        Date aniversario = sdf.parse(sc.next());
        Cliente cliente = new Cliente(nome, email, aniversario);
        System.out.println("Digite os dados do pedido:");
        System.out.println("Status:");
        StatusPedido statusPedido = StatusPedido.valueOf(sc.next());
        Pedido pedido = new Pedido(new Date(), statusPedido, cliente);
        System.out.println("Quantos itens o pedido vai ter?");
        int n = sc.nextInt();

        for(int i = 1; i <= n; ++i) {
            System.out.println("Digite o pedido número: " + i);
            System.out.println("Nome do produto: ");
            sc.nextLine();
            String nomeProduto = sc.next();
            System.out.println("Digite o preço do produto:");
            double precoProduto = sc.nextDouble();
            System.out.println("Quantidade do produto:");
            int quantidadeProduto = sc.nextInt();
            Produto produto = new Produto(nomeProduto, precoProduto);
            ItemPedido itemPedido = new ItemPedido(quantidadeProduto, precoProduto, produto);
            pedido.addItem(itemPedido);
        }

        System.out.println();
        System.out.println(pedido);
        sc.close();
    }
}
