//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Modulo1_EstruturaSequencial.Aula1_SaidaDeDados.Exercicios;

import java.util.Locale;

public class Exercicio {
    public Exercicio() {
    }

    public static void main(String[] args) {
        String produto1 = "Computer";
        String produto2 = "Mesa";
        int idade = 30;
        int codigo = 5290;
        char sexo = 'F';
        double preco1 = 2100.0;
        double preco2 = 650.5;
        double medidas = 53.234567;
        System.out.println("Produtos:");
        System.out.printf("%s tem o preço de %.2f.%n", produto1, preco1);
        System.out.printf("%s tem o preço de %.2f.%n%n", produto2, preco2);
        System.out.printf("Record: %d anos,código %d e genêro: %s%n%n ", Integer.valueOf(idade), Integer.valueOf(codigo), sexo);
        System.out.printf("Medida com oito casas decimais: %.8f%n", medidas);
        System.out.printf("Cercado (com três casas decimais:)%.3f%n", medidas);
        Locale.setDefault(Locale.US);
        System.out.printf("Medida com separador ponto: %.3f%n", medidas);
    }
}
