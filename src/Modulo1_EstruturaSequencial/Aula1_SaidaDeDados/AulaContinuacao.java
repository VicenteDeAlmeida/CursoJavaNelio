//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Modulo1_EstruturaSequencial.Aula1_SaidaDeDados;

import java.util.Locale;

public class AulaContinuacao {
    public AulaContinuacao() {
    }

    public static void main(String[] args) {
        System.out.println("Concatenando vários elementos em um mesmo comando de escrita. Regra geral para print e println");
        Locale.setDefault(Locale.US);
        double x = 10.368987;
        System.out.println("RESULTADO= " + x + " METROS.");
        System.out.println("Concatenando vários elementos em um mesmo comando de escrita. Regra geral para printf");
        System.out.printf("RESULTADO = %.2f metros%n", x);
        System.out.println("Concatenando vários elementos em um mesmo comando de escritaRegra geral para printf");
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais.%n", nome, Integer.valueOf(idade), renda);
    }
}
