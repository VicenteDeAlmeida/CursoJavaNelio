package Modulo7_Memoria_Array_Lista.Aula1_Vetor;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] vect = new double[n];

        for(int i = 0; i < n; ++i) {
            vect[i] = sc.nextDouble();
        }

        double soma = 0.0;

        for(int i = 0; i < n; ++i) {
            soma += vect[i];
        }

        double media = soma / (double)n;
        System.out.printf("A média da alturas é:%.2f ", media);
        sc.close();
    }
}
