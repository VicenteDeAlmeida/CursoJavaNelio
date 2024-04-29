//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Modulo9_Enumeracoes_Composicao.Aula1_Enumeracoes.entidadess;

import Modulo9_Enumeracoes_Composicao.Aula1_Enumeracoes.entidades.enums.StatusPedido;
import java.util.Date;

public class Pedido {
    private Integer id;
    private Date data;
    private StatusPedido status;

    public Pedido() {
    }

    public Pedido(Integer id, Date data, StatusPedido status) {
        this.id = id;
        this.data = data;
        this.status = status;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public StatusPedido getStatus() {
        return this.status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public String toString() {
        return "Pedido{id=" + this.id + ", data=" + this.data + ", status=" + this.status + "}";
    }
}
