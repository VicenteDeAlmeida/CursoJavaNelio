

package Modulo1_EstruturaSequencial.Aula6_Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int peca1 = sc.nextInt();
        int numeropecas = sc.nextInt();
        double valorUnPeca1 = sc.nextDouble();
        double valorTotalpeca1 = (double)numeropecas * valorUnPeca1;
        int peca2 = sc.nextInt();
        int numeroPecas2 = sc.nextInt();
        double valorUnPeca2 = sc.nextDouble();
        double valorTotalpeca2 = (double)numeroPecas2 * valorUnPeca2;
        double valorCompra = valorTotalpeca1 + valorTotalpeca2;
        System.out.printf("Código peça 1= %d%nCódigo peça 2= %d%nO valor total da compra foi de %.2f.", peca1, peca2, valorCompra);
        sc.close();
    }
}
