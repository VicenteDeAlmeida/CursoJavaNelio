//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Modulo3_EstruturasRepetitivas.Aula3_For;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int soma = 0;

        int m;
        for(m = 0; m < N; ++m) {
            int x = sc.nextInt();
            soma += x;
        }

        System.out.println(soma);
        sc.close();
        System.out.println("Contagem progressiva");

        for(m = 0; m <= 5; ++m) {
            System.out.println("Valor de x = " + m);
        }

        System.out.println("Contagem regressiva");

        for(m = 4; m >= 0; --m) {
            System.out.println("Valor de x = " + m);
        }

    }
}
