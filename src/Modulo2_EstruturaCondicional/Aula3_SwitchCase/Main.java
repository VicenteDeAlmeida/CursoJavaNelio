package Modulo2_EstruturaCondicional.Aula3_SwitchCase;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor!!");
        int valor = sc.nextInt();
        String dia;
        switch (valor) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            default:
                dia = "Valor  inválido";
        }

        System.out.println("Dia da semana: " + dia);
        sc.close();
    }
}
