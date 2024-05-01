package Modulo11_TratamendoDeExcecoes.Aula2_PilhaDeChamadaDeMetodos.aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramaExcecao2 {
    public static void main(String[] args) {
        metodo1();

        System.out.println("Fim do Programa");
    }

    public static void metodo1(){
        System.out.println("***INICIO DA EXECUÇÂO DO MÉTODO1***");
        metodo2();
        System.out.println("***FIM DA EXECUÇÂO DO MÉTODO1***");

    }
    public static void metodo2(){
        System.out.println("***INICIO DA EXECUÇÂO DO MÉTODO2***");
        Scanner sc = new Scanner(System.in);
        try {
            String[] vect1 = sc.nextLine().split(" ");
            int posicao1 = sc.nextInt();
            System.out.println(vect1[posicao1]);
        }
        catch (ArrayIndexOutOfBoundsException array){
            System.out.println("Posição inválida!!");
            array.printStackTrace(); /*Print stack trace mostra toda a pilha de chamada de métodos que acarretou a exceção
            se acontecer uma exceção e quiser fazer uma análise do que acrretou a exceção pode se usar o printStackTrace();*/
            //sc.next();
        }
        catch (InputMismatchException input){
            System.out.println("São aceitos somente números!!");
        }


        sc.close();

        System.out.println("***FIM DA EXECUÇÂO DOS MÉTODOS***");

    }


}
