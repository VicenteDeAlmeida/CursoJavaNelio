package Modulo11_TratamendoDeExcecoes.Aula3_BlocoFinally;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *  É um bloco que contém código a ser executado independentemente de ter
 * ocorrido ou não uma exceção.
 * Exemplo clássico: fechar um arquivo, conexão de banco de dados, ou outro
 * recurso específico ao final do processamento.
 * */

public class Programa {
    public static void main(String[] args) {
        File file = new File("C:\\temp\\in.txt"); /*Classe File para tentar ler um arquivo inxistente*/
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

            System.out.println("Executado bloco finally.");
        }
    }
}
