//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Modulo9_Enumeracoes_Composicao.Aula4_Exercicio.entidades;

import Modulo9_Enumeracoes_Composicao.Aula4_Exercicio.entidades.enums.StatusPedido;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Pedido {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date momento;
    private StatusPedido statusPedido;
    private Cliente cliente;
    private List<ItemPedido> itens = new ArrayList();

    public Pedido() {
    }

    public Pedido(Date momento, StatusPedido statusPedido, Cliente cliente) {
        this.momento = momento;
        this.statusPedido = statusPedido;
        this.cliente = cliente;
    }

    public Date getMomento() {
        return this.momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public StatusPedido getStatusPedido() {
        return this.statusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addItem(ItemPedido item) {
        this.itens.add(item);
    }

    public void removeItem(ItemPedido item) {
        this.itens.remove(item);
    }

    public double Total() {
        double soma = 0.0;

        ItemPedido ip;
        for(Iterator var3 = this.itens.iterator(); var3.hasNext(); soma += ip.subTotal()) {
            ip = (ItemPedido)var3.next();
        }

        return soma;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Momento do pedido: ");
        sb.append(sdf.format(this.momento) + "\n");
        sb.append("Status do pedido:: ");
        sb.append(this.statusPedido + "\n");
        sb.append("Cliente: ");
        sb.append(this.cliente + "\n");
        sb.append("Itens do pedido:\n");
        Iterator var2 = this.itens.iterator();

        while(var2.hasNext()) {
            ItemPedido item = (ItemPedido)var2.next();
            sb.append("" + item + "\n");
        }

        sb.append("Preço Total: $");
        sb.append(String.format("%.2f", this.Total()));
        return sb.toString();
    }
}
