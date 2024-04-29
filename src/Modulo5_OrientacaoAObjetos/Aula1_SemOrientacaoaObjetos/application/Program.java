package Modulo5_OrientacaoAObjetos.Aula1_SemOrientacaoaObjetos.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as medidas do triângulo X: ");
        double xA = sc.nextDouble();
        double xB = sc.nextDouble();
        double xC = sc.nextDouble();
        System.out.println("Digite as medidas do triângulo y: ");
        double yA = sc.nextDouble();
        double yB = sc.nextDouble();
        double yC = sc.nextDouble();
        double p = (xA + xB + xC) / 2.0;
        double areax = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
        p = (yA + yB + yC) / 2.0;
        double areay = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
        System.out.printf("Área do triângulo X: %.4f.%n ", areax);
        System.out.printf("Área do triângulo Y: %.4f.%n ", areay);
        if (areax > areay) {
            System.out.printf("A maior área é a do triangulo X,medindo %.4f.%n.", areax);
        } else {
            System.out.printf("A maior área é a do triangulo Y,medindo %.4f.", areay);
        }

        sc.close();
    }
}
