package Modulo7_Memoria_Array_Lista.Aula2_vetor.aplicacao;

import Modulo7_Memoria_Array_Lista.Aula2_vetor.entidade.ProdutoVetor;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaVetor {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de produtos:");
        int n = scanner.nextInt();
        ProdutoVetor[] vect = new ProdutoVetor[n];

        double media;
        for(int i = 0; i < vect.length; ++i) {
            scanner.nextLine();
            System.out.println("Digite o nome do produto:");
            String nome = scanner.nextLine();
            System.out.println("Digite o preço do produto:");
            media = scanner.nextDouble();
            vect[i] = new ProdutoVetor(nome, media);
        }

        double soma = 0.0;

        for(int i = 0; i < vect.length; ++i) {
            soma += vect[i].getPreco();
        }

        media = soma / (double)vect.length;
        System.out.printf("A média de preços ficou em %.2f", media);
        scanner.close();
    }
}
