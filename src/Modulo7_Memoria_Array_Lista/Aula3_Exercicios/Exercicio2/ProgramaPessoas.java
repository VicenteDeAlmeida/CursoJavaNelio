package Modulo7_Memoria_Array_Lista.Aula3_Exercicios.Exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaPessoas {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas pessoas serão digitadas?");
        int numeroPessoas = scanner.nextInt();
        String[] nomes = new String[numeroPessoas];
        int[] idades = new int[numeroPessoas];
        double[] alturas = new double[numeroPessoas];

        for(int i = 0; i < numeroPessoas; ++i) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.println("Nome: ");
            nomes[i] = scanner.next();
            System.out.println("Idade: ");
            idades[i] = scanner.nextInt();
            System.out.println("Altura: ");
            alturas[i] = scanner.nextDouble();
        }

        double soma = 0.0;

        for(int i = 0; i < numeroPessoas; ++i) {
            soma += alturas[i];
        }

        double mediaAlturas = soma / (double)numeroPessoas;
        System.out.printf("Altura média:%.2f%n", mediaAlturas);
        int cont = 0;

        for(int i = 0; i < numeroPessoas; ++i) {
            if (idades[i] < 16) {
                ++cont;
            }
        }

        double percent = (double)cont * 100.0 / (double)numeroPessoas;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);

        for(int i = 0; i < numeroPessoas; ++i) {
            if (idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }

        scanner.close();
    }
}
