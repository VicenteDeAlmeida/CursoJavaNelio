package Modulo5_OrientacaoAObjetos.Aula8_MembrosEstaticos.Aula1.Aplicacao;

import Modulo5_OrientacaoAObjetos.Aula8_MembrosEstaticos.Aula1.Utils.Calculo;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculo calculo = new Calculo();
        System.out.print("Digite o valor do raio:");
        double raio = sc.nextDouble();
        double circ = calculo.circunferencia(raio);
        double vol = calculo.volume(raio);
        System.out.printf("Circunferência:%.2f%n", circ);
        System.out.printf("Volume:%.2f%n", vol);
        PrintStream var10000 = System.out;
        Object[] var10002 = new Object[1];
        Objects.requireNonNull(calculo);
        var10002[0] = 3.14159;
        var10000.printf("Valor do PI:%.2f%n", var10002);
        sc.close();
    }
}
