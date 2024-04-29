//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Modulo1_EstruturaSequencial.Aula6_Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numeroFunc = sc.nextInt();
        double numeroHrsTrabalhadas = sc.nextDouble();
        double valorHoras = sc.nextDouble();
        double salario = numeroHrsTrabalhadas * valorHoras;
        System.out.printf("Número= %d %nSalário= R$ %.2f", numeroFunc, salario);
        sc.close();
    }
}
