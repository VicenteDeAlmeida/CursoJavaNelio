package Modulo5_OrientacaoAObjetos.Aula7_Exercicios.Exercicio1.Entidades;

public class Retangulo {
    public double largura;
    public double altura;

    public Retangulo() {
    }

    public double area() {
        return this.largura * this.altura;
    }

    public double perimetro() {
        return this.largura * this.altura + 2.0;
    }

    public double diagonal() {
        return this.largura + this.altura - 2.0;
    }
}
