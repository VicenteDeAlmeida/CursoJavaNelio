
package Modulo1_EstruturaSequencial.Aula5_FuncoesMatematicas;

public class FuncoesMatematicas {
    public FuncoesMatematicas() {
    }

    public static void main(String[] args) {
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A = Math.sqrt(x);
        double B = Math.sqrt(y);
        double C = Math.sqrt(25.0);
        System.out.println("Raíz quadrada de " + x + "=" + A);
        System.out.println("Raíz quadrada de " + y + "=" + B);
        System.out.println("Raíz quadrada de " + z + "=" + C);
        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.println("" + x + "elevado a " + y + "é igual a " + A);
        System.out.println("" + x + "elevado ao quadrado é igual a " + B);
        System.out.println("Cinco elevado ao quadrado é igual a" + C);
        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("O valor absoluto de " + y + "é igual a " + A);
        System.out.println("O valor absoluto de " + z + "é igual a " + B);
    }
}
