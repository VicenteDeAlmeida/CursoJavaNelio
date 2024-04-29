//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Modulo5_OrientacaoAObjetos.Aula8_MembrosEstaticos.Aula2.Aplicacao;

import Modulo5_OrientacaoAObjetos.Aula8_MembrosEstaticos.Aula2.Utils.Calculo;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public Programa() {
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do raio:");
        double raio = sc.nextDouble();
        double circ = Calculo.circunferencia(raio);
        double vol = Calculo.volume(raio);
        System.out.printf("Circunferência:%.2f%n", circ);
        System.out.printf("Volume:%.2f%n", vol);
        System.out.printf("Valor do PI:%.2f%n", 3.14159);
        sc.close();
    }
}
