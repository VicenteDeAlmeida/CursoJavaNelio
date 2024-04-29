
package Modulo2_EstruturaCondicional.Aula4_CondicionalTernaria;

public class Main {
    public static void main(String[] args) {
        int i = 80;
        System.out.println(i);
        double preco = 34.5;
        double desconto = preco < 20.0 ? preco * 0.1 : preco * 0.5;
        System.out.println(desconto);
    }
}
