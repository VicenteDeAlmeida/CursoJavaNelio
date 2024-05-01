package Modulo11_TratamendoDeExcecoes.Aula3_BlocoFinally;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ProgramaContinuacaoAulaAnterior {

    public static void main(String[] args) {
        File file = new File("C:\\temp\\in.txt"); /*Agora o arquivo existe la no meu C*/
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e){
            System.out.println("Erro ao abrir o arquivo " + e.getMessage()); /*getMessage é a mensagem padrão do Java quando um arquivo não é encontrado*/
        }
        finally {
            if (sc != null){
                sc.close();
            }

            System.out.println("Executado bloco finally."); /*Bloco finally aqui também é executado,assim como no progrma da aula anterior*/

            System.out.println("Conclusão: O bloco finally é executado independente do que tiver no try");
        }
    }
}
