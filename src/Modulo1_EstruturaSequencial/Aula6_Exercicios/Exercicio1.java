package Modulo1_EstruturaSequencial.Aula6_Exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public Exercicio1() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número.");
        int valorUm = sc.nextInt();
        System.out.println("Digite o segundo número.");
        int valorDois = sc.nextInt();
        int soma = valorUm + valorDois;
        System.out.println("Soma = " + soma);
        sc.close();
    }
}
