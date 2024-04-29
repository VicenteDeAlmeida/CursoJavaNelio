package Modulo10_Heranca_Polimorfismo.Aula9_MetodosAbstratos.entidades;

import Modulo10_Heranca_Polimorfismo.Aula9_MetodosAbstratos.enums.Cor;

public class Circulo extends Forma {

    Double raio;

    public Circulo(){
        super();

    }


    public Circulo(Cor cor, Double raio) {
        super(cor);
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(raio,2);
    }
}
