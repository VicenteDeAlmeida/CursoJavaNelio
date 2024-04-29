

package Modulo7_Memoria_Array_Lista.Aula6_Matrizes.aplicacao;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de linhas e colunas da matriz:");
        int numero = sc.nextInt();
        int[][] matriz = new int[numero][numero];

        int count;
        int i;
        for(count = 0; count < matriz.length; ++count) {
            for(i = 0; i < matriz[count].length; ++i) {
                matriz[count][i] = sc.nextInt();
            }
        }

        System.out.println("Diagonal principal:");

        for(count = 0; count < matriz.length; ++count) {
            System.out.print(matriz[count][count] + " ");
        }

        System.out.println();
        count = 0;

        for(i = 0; i < matriz.length; ++i) {
            for(int j = 0; j < matriz[i].length; ++j) {
                if (matriz[i][j] < 0) {
                    ++count;
                }
            }
        }

        System.out.println("Números negativos:" + count);
        sc.close();
    }
}
