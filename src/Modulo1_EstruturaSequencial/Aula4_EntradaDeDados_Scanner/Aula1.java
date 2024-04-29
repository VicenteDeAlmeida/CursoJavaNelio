package Modulo1_EstruturaSequencial.Aula4_EntradaDeDados_Scanner;

import java.util.Scanner;

public class Aula1 {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String x = sc.next();
            System.out.println("Você digitou " + x);
            int z = sc.nextInt();
            System.out.println("Você digitou " + z);
            double y = sc.nextDouble();
            System.out.printf("Você digitou %.2f%n", y);
            char c = sc.next().charAt(3);
            System.out.println("Você digitou " + c);
            sc.close();
        }
    }


