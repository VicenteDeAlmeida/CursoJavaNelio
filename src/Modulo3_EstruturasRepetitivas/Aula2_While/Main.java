package Modulo3_EstruturasRepetitivas.Aula2_While;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros = sc.nextInt();

        int soma;
        for(soma = 0; numeros != 0; numeros = sc.nextInt()) {
            soma += numeros;
        }

        System.out.println("A soma deu " + soma);
        sc.close();
    }
}
