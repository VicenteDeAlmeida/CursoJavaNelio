
package Modulo4_TopicosBasicos.Aula1_FuncoesParaString;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Aqui vamos ver split,fatiamento de strings:");
        String suco = "Tomate Maçã Limão";
        String[] vetor = suco.split(" ");
        System.out.println("Posição 0: " + vetor[0]);
        System.out.println("Posição 1: " + vetor[1]);
        System.out.println("Posição 2: " + vetor[2]);
    }
}
