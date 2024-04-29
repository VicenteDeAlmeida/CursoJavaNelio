package Modulo2_EstruturaCondicional.Aula2_Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double custoPlano = 50.0;
        int minutosPlano = 100;
        System.out.println("Quantos minutos foram gastos?");
        double minutosGastos = sc.nextDouble();
        if (minutosGastos > (double)minutosPlano) {
            double novoCusto = (minutosGastos - (double)minutosPlano) * 2.0 + custoPlano;
            double excessoFranquia = minutosGastos - (double)minutosPlano;
            System.out.printf("Você excedeu sua franquia em %.0f minutos.A sua fatura será de %.2f.", excessoFranquia, novoCusto);
        } else {
            System.out.printf("A sua fatura será de %.2f.", custoPlano);
        }

        sc.close();
    }
}
