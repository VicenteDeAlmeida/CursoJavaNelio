package Modulo1_EstruturaSequencial.Aula6_Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("Digite o raio do círculo!");
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();
        double pi = 3.14159;
        double area = pi * raio * raio;
        System.out.printf("A = %.4f", area);
        sc.close();
    }
}
