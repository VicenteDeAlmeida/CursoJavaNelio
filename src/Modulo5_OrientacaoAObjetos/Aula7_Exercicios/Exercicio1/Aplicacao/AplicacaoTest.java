package Modulo5_OrientacaoAObjetos.Aula7_Exercicios.Exercicio1.Aplicacao;

import Modulo5_OrientacaoAObjetos.Aula7_Exercicios.Exercicio1.Entidades.Retangulo;
import java.util.Locale;
import java.util.Scanner;

public class AplicacaoTest {
    public AplicacaoTest() {
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();
        System.out.println("Digite a largura!!");
        retangulo.largura = scanner.nextDouble();
        System.out.println("Digite a altura!!");
        retangulo.altura = scanner.nextDouble();
        System.out.printf("A area do triangulo é %.2f.%nO seu perímetro é %.2f e a sua diagonal é %.2f.", retangulo.area(), retangulo.perimetro(), retangulo.diagonal());
        scanner.close();
    }
}
