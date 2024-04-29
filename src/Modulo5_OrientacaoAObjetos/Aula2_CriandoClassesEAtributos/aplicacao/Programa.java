//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Modulo5_OrientacaoAObjetos.Aula2_CriandoClassesEAtributos.aplicacao;

import Modulo5_OrientacaoAObjetos.Aula2_CriandoClassesEAtributos.entidades.Triangulo;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Triangulo x = new Triangulo();
        Triangulo y = new Triangulo();
        System.out.println("Digite as medidas do triângulo X:");
        x.ladoA = scanner.nextDouble();
        x.ladoB = scanner.nextDouble();
        x.ladoC = scanner.nextDouble();
        System.out.println("Digite as medidas do triângulo Y: ");
        y.ladoA = scanner.nextDouble();
        y.ladoB = scanner.nextDouble();
        y.ladoC = scanner.nextDouble();
        double p = (x.ladoA + x.ladoB + x.ladoC) / 2.0;
        double areaTrianguloX = Math.sqrt(p * (p - x.ladoA) * (p - x.ladoB) * (p - x.ladoC));
        p = (y.ladoA + y.ladoB + y.ladoC) / 2.0;
        double areaTrianguloY = Math.sqrt(p * (p - y.ladoA) * (p - y.ladoB) * (p - y.ladoC));
        System.out.printf("Área do triângulo X: %.2f%n ", areaTrianguloX);
        System.out.printf("Área do triângulo Y: %.2f%n ", areaTrianguloY);
        if (areaTrianguloX > areaTrianguloY) {
            System.out.printf("A área do triângulo X é a maior medindo %.2f%n", areaTrianguloX);
        } else {
            System.out.printf("A área do triângulo Y é a maior medindo %.2f%n", areaTrianguloY);
        }

        scanner.close();
    }
}
