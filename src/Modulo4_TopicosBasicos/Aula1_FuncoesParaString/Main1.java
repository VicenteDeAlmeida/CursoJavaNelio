package Modulo4_TopicosBasicos.Aula1_FuncoesParaString;

public class Main1 {
    public static void main(String[] args) {
        String meuNome = "Vicente de Almeida Luiz";
        String subsTring = meuNome.substring(2);
        System.out.println("Com substring fica: " + subsTring);
        System.out.println("Podemos passar direto no println também:");
        System.out.println("Com substring fica assim: " + meuNome.substring(4));
        System.out.println("**********************SEPARADOR*************************");
        System.out.println("POdemos utilizar o substring para fatiar a string de um índice até outro");
        String subsTring2 = meuNome.substring(2, 10);
        System.out.println("Aqui vai imprimir do índice 2 até o índice 9: " + subsTring2);
        System.out.println("Podemos passar direto no println também:");
        System.out.println("De um índice até o outro fica assim: " + meuNome.substring(11, 18));
        System.out.println("**********************SEPARADOR*************************");
        System.out.println("Utilizando replace para substituir uma string por outra:");
        String replacee = meuNome.replace("e", "x");
        System.out.println("Com replace nesse caso o e vai ser substituido por x: " + replacee);
        System.out.println("Podemos passar direto no println também:");
        System.out.println("Nesse caso fica assim: " + meuNome.replace("V", "D"));
        System.out.println("Posso utilzar o replace par substituir mais de uma string também,aqui vou passar somente no prinln:");
        System.out.println("String original: " + meuNome);
        System.out.println("Vai ficar assim: " + meuNome.replace("Almeida", "Almeida0589"));
        System.out.println("**********************SEPARADOR*************************");
        String outronome = "Vicente de Almeida de Luiz";
        System.out.println("Usando indexof eu pego a primeira posição da string");
        System.out.println(outronome.indexOf("de"));
        System.out.println("Usando lastindexof eu pego a última posição da string");
        System.out.println(outronome.lastIndexOf("de"));
        System.out.println("Continua na próxima classe Main3");
    }
}
