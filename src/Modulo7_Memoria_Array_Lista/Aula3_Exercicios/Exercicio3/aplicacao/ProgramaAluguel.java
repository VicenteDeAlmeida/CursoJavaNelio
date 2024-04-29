package Modulo7_Memoria_Array_Lista.Aula3_Exercicios.Exercicio3.aplicacao;

import Modulo7_Memoria_Array_Lista.Aula3_Exercicios.Exercicio3.entidade.Aluguel;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaAluguel {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Aluguel[] vetor = new Aluguel[10];
        System.out.println("Quantos quartos serão alugados?");
        int quantidade = sc.nextInt();

        int i;
        for(i = 1; i <= quantidade; ++i) {
            System.out.println();
            System.out.println("Quarto #" + i + ":");
            System.out.print("Name :");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Quarto: ");
            int numeroQuarto = sc.nextInt();
            vetor[numeroQuarto] = new Aluguel(nome, email);
        }

        System.out.println();
        System.out.println("Quartos Ocupados:");

        for(i = 0; i < 10; ++i) {
            if (vetor[i] != null) {
                System.out.println("" + i + ":" + vetor[i]);
            }
        }

        sc.close();
    }
}
