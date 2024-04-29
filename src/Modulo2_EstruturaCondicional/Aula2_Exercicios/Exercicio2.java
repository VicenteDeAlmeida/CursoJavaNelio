
package Modulo2_EstruturaCondicional.Aula2_Exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public Exercicio2() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para sabermos se ele é par ou ímpar!!");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Número par!!");
        } else {
            System.out.println("Número ímpar!!");
        }

        scanner.close();
    }
}
