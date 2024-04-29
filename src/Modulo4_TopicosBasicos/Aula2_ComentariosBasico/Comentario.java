package Modulo4_TopicosBasicos.Aula2_ComentariosBasico;

import java.util.Locale;
import java.util.Scanner;

public class Comentario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os valores dos coeficientes:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double var10000 = b * b - 4.0 * a * c;
    }
}
