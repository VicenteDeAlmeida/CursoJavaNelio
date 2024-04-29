package Modulo5_OrientacaoAObjetos.Aula7_Exercicios.Exercicio3.Aplicacao;

import Modulo5_OrientacaoAObjetos.Aula7_Exercicios.Exercicio3.Entidades.Aluno;
import java.util.Locale;
import java.util.Scanner;

public class AplicacaoTeste {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();
        System.out.println("Digite o nome do aluno:");
        aluno.nome = sc.nextLine();
        System.out.println("Digite a primeira nota:");
        aluno.nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota:");
        aluno.nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota:");
        aluno.nota3 = sc.nextDouble();
        aluno.notaFinal();
        aluno.alunoAprovado();
        sc.close();
    }
}
