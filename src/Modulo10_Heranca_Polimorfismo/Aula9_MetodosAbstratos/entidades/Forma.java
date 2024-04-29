package Modulo10_Heranca_Polimorfismo.Aula9_MetodosAbstratos.entidades;

import Modulo10_Heranca_Polimorfismo.Aula9_MetodosAbstratos.enums.Cor;

/**
 * São métodos que não possuem implementação.
 * • Métodos precisam ser abstratos quando a classe
 * é genérica demais para conter sua
 * implementação.
 * • Se uma classe possuir pelo menos um método
 * abstrato, então esta classe também é abstrata
 *  Notação UML: itálico
 * */

public abstract class Forma {

    public Forma(){

    }

    public Forma(Cor cor) {
        this.cor = cor;
    }

    private Cor cor;

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public abstract double area(); //Método abstarto se cria desse jeito
}
