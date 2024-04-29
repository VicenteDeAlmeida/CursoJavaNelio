//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Modulo9_Enumeracoes_Composicao.Aula3_ComposicaoEStringBuilder.aplicacao;

import Modulo9_Enumeracoes_Composicao.Aula3_ComposicaoEStringBuilder.entidades.Comentarios;
import Modulo9_Enumeracoes_Composicao.Aula3_ComposicaoEStringBuilder.entidades.Post;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Programa {
    public Programa() {
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Comentarios c1 = new Comentarios("Tenha uma boa viagem!");
        Comentarios c2 = new Comentarios("Uau,isso é incrível!");
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Viagem a Nova Zelândia", "Vou visitar esse país maravilhoso!", 12);
        p1.addComentario(c1);
        p1.addComentario(c2);
        System.out.println(p1);
        Comentarios c3 = new Comentarios("Boa noite!");
        Comentarios c4 = new Comentarios("Que a força esteja com você");
        Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Boa noite!", "Nos vemos amanhã.", 5);
        p2.addComentario(c3);
        p2.addComentario(c4);
        System.out.println(p2);
    }
}
