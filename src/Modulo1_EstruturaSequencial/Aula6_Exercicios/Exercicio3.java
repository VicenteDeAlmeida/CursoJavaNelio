package Modulo1_EstruturaSequencial.Aula6_Exercicios;

import java.util.Scanner;

public class Exercicio3 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int diferenca = A * B - C * D;
        System.out.println("Diferença = " + diferenca);
        sc.close();
    }
}
