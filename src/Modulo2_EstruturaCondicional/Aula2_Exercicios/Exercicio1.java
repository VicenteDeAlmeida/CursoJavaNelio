package Modulo2_EstruturaCondicional.Aula2_Exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        System.out.println("Digite um número!!");
        Scanner sc = new Scanner(System.in);
        double numero = sc.nextDouble();
        if (numero < 0.0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NÃO NEGATIVO");
        }

        sc.close();
    }
}
