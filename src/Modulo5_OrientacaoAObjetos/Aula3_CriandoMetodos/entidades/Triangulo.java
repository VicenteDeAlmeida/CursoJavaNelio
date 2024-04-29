
package Modulo5_OrientacaoAObjetos.Aula3_CriandoMetodos.entidades;

public class Triangulo {
    public double ladoA;
    public double ladoB;
    public double ladoC;

    public Triangulo() {
    }

    public double area() {
        double p = (this.ladoA + this.ladoB + this.ladoC) / 2.0;
        return Math.sqrt(p * (p - this.ladoA) * (p - this.ladoB) * (p - this.ladoC));
    }
}
