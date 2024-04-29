//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Modulo9_Enumeracoes_Composicao.Aula3_ComposicaoEStringBuilder.entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Post {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date momento;
    private String titulo;
    private String content;
    private Integer likes;
    private List<Comentarios> comentarios = new ArrayList();

    public Post() {
    }

    public Post(Date momento, String titulo, String content, Integer likes) {
        this.momento = momento;
        this.titulo = titulo;
        this.content = content;
        this.likes = likes;
    }

    public Date getMomento() {
        return this.momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return this.likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comentarios> getComentarios() {
        return this.comentarios;
    }

    public void addComentario(Comentarios comentario) {
        this.comentarios.add(comentario);
    }

    public void removerComentario(Comentarios comentario) {
        this.comentarios.remove(comentario);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.titulo + "\n");
        sb.append(this.likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(this.momento) + "\n");
        sb.append(this.content + "\n");
        sb.append("Comentários: \n");
        Iterator var2 = this.comentarios.iterator();

        while(var2.hasNext()) {
            Comentarios c = (Comentarios)var2.next();
            sb.append(c.getTexto() + "\n");
        }

        return sb.toString();
    }
}
