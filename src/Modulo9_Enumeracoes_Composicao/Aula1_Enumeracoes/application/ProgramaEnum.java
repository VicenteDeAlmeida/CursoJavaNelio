//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Modulo9_Enumeracoes_Composicao.Aula1_Enumeracoes.application;

import Modulo9_Enumeracoes_Composicao.Aula1_Enumeracoes.entidades.enums.StatusPedido;
import Modulo9_Enumeracoes_Composicao.Aula1_Enumeracoes.entidadess.Pedido;
import java.util.Date;

public class ProgramaEnum {
    public ProgramaEnum() {
    }

    public static void main(String[] args) {
        Pedido pedido = new Pedido(1080, new Date(), StatusPedido.AGUARDANDO_PAGAMENTO);
        System.out.println(pedido);
        StatusPedido os1 = StatusPedido.ENTREGUE;
        StatusPedido os2 = StatusPedido.valueOf("ENTREGUE");
        System.out.println(os1);
        System.out.println(os2);
    }
}
