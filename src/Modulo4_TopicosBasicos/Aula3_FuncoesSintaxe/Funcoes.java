
package Modulo4_TopicosBasicos.Aula3_FuncoesSintaxe;

import java.util.Scanner;

public class Funcoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 3 números:");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int numero3 = sc.nextInt();
        int max = maximo(numero1, numero2, numero3);
        maiorValor(max);
        sc.close();
    }

    public static int maximo(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }

        return aux;
    }

    public static void maiorValor(int valor) {
        System.out.println("Maior valor é: " + valor);
    }
}
