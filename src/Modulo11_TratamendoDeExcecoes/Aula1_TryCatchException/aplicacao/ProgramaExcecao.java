package Modulo11_TratamendoDeExcecoes.Aula1_TryCatchException.aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *Uma exceção é qualquer condição de erro ou comportamento
 * inesperado encontrado por um programa em execução
 *• O modelo de tratamento de exceções permite que erros sejam
 * tratados de forma consistente e flexível, usando boas práticas
 * • Vantagens:
 * • Delega a lógica do erro para a classe responsável por conhecer as regras que
 * podem ocasionar o erro
 * • Trata de forma organizada (inclusive hierárquica) exceções de tipos diferentes
 * • A exceção pode carregar dados quaisquer
 * */
public class ProgramaExcecao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       /* String[] vect = sc.nextLine().split(" ");
        int posicao = sc.nextInt();
        System.out.println(vect[posicao]);*/

        /*Esse programa pode dar uma exceção,se ao invés do número na posição eu digitar uma letra,nesse caso a exceção é a
        InputMismatchException
        * Outra exceção exemplo:Eu escrever três palavras e pedir o index 5 do vetor,nesse caso a exceção é a
        * ArrayIndexOutOfBoundsException */

        /*Agora vou criar outro programa,porém tratando as exceções citadas acima*/
        try {
            String[] vect1 = sc.nextLine().split(" ");
            int posicao1 = sc.nextInt();
            System.out.println(vect1[posicao1]);
        }
        catch (ArrayIndexOutOfBoundsException array){
            System.out.println("Posição inválida!!");
        }
        catch (InputMismatchException input){
            System.out.println("São aceitos somente números!!");
        }

        System.out.println("Fim do algoritmo!!");

        sc.close();
    }


}
