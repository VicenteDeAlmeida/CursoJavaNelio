package Modulo7_Memoria_Array_Lista.Aula3_Exercicios.Exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaNumerosNegativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números você vai digitar?");
        int numeros = sc.nextInt();
        int[] vetor = new int[numeros];

        int i;
        for(i = 0; i < numeros; ++i) {
            System.out.println("Digite um número!!");
            vetor[i] = sc.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS: ");

        for(i = 0; i < numeros; ++i) {
            if (vetor[i] < 0) {
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }
}
