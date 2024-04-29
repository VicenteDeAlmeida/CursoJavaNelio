package Modulo10_Heranca_Polimorfismo.Aula9_MetodosAbstratos.aplicacao;

import Modulo10_Heranca_Polimorfismo.Aula9_MetodosAbstratos.entidades.Circulo;
import Modulo10_Heranca_Polimorfismo.Aula9_MetodosAbstratos.entidades.Forma;
import Modulo10_Heranca_Polimorfismo.Aula9_MetodosAbstratos.entidades.Retangulo;
import Modulo10_Heranca_Polimorfismo.Aula9_MetodosAbstratos.enums.Cor;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ClasseDeExecucao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Forma>listaFormas = new ArrayList<>();

        System.out.print("Digite o número de formas:");
        int numeroFormas = sc.nextInt();

        for (int i = 1; i<=numeroFormas ; i++){
            System.out.println("Digite a forma "+ i + ":");
            System.out.print("Retângulo ou Círculo? ");
            String tipoForma = sc.next();
            System.out.print("Cor? (PRETO/AZUL/VERMELHO):");
            Cor cor = Cor.valueOf(sc.next());
            if (tipoForma.equalsIgnoreCase("Retangulo")){
                System.out.print("Largura: ");
                Double largura = sc.nextDouble();
                System.out.print("Altura: ");
                Double altura = sc.nextDouble();
                listaFormas.add(new Retangulo(cor,altura,largura));
            }else {
                System.out.print("Raio: ");
                Double raio = sc.nextDouble();
                listaFormas.add(new Circulo(cor,raio));
            }
        }

        System.out.println("Áreas das Formas:");
        for (Forma forma : listaFormas){
            System.out.printf("%.2f \n",forma.area());
        }




        sc.close();
    }
}
