package Modulo5_OrientacaoAObjetos.Aula7_Exercicios.Exercicio3.Entidades;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;


    public double notaFinal() {
        return this.nota1 + this.nota2 + this.nota3;
    }

    public void alunoAprovado() {
        double notaFaltante = 60.0 - this.notaFinal();
        if (this.notaFinal() < 60.0) {
            System.out.printf("Nota final: %.2f.Faltaram %.0f pontos para você ser aprovado.", this.notaFinal(), notaFaltante);
        } else {
            System.out.printf("Nota Final:%.2f.Você foi aprovado.", this.notaFinal());
        }

    }
}
