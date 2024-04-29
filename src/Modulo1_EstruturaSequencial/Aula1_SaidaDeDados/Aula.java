
package Modulo1_EstruturaSequencial.Aula1_SaidaDeDados;

import java.util.Locale;

public class Aula {
    public Aula() {
    }

    public static void main(String[] args) {
        System.out.println("Olá Mundo!!");
        System.out.println("Bom dia!!");
        System.out.println("Seu eu não quiser quebrar a linha é só usar somente print");
        System.out.print("Vicente ");
        System.out.print("Almeida ");
        System.out.println();
        System.out.println("Escrevendo na tela o valor de uma variável");
        int y = 32;
        System.out.println(y);
        System.out.println("Escrevendo com uma variável de ponto flutuante");
        double x = 10.3589;
        System.out.println(x);
        System.out.println("Agora controlando as casas decimais da variável double");
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);
    }
}
