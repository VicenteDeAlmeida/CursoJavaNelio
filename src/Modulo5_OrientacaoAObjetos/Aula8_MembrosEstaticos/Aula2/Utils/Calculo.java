package Modulo5_OrientacaoAObjetos.Aula8_MembrosEstaticos.Aula2.Utils;

public class Calculo {
    public static final double PI = 3.14159;

    public Calculo() {
    }

    public static double circunferencia(double raio) {
        return 6.28318 * raio;
    }

    public static double volume(double raio) {
        return 12.56636 * raio * raio * raio / 3.0;
    }
}
