//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Modulo1_EstruturaSequencial.Aula2_ProcessamentoDeDadosECasting;

public class TesteProcessamentoAreaTrapezio {
    public TesteProcessamentoAreaTrapezio() {
    }

    public static void main(String[] args) {
        double b = 6.0;
        double B = 8.0;
        double h = 5.0;
        double area = (b + B) / 2.0 * h;
        System.out.println("A área do trapézio é " + area + ".");
        System.out.println("Outro exemplo:");
        int z = 5;
        int d = 2;
        double resultado = (double)(z / d);
        System.out.println(resultado);
        resultado = (double)z / (double)d;
        System.out.println(resultado);
    }
}
