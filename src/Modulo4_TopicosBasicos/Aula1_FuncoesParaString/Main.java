package Modulo4_TopicosBasicos.Aula1_FuncoesParaString;

public class Main {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG     ";
        System.out.println("String original: " + original);
        String s01 = original.toLowerCase();
        System.out.println("String com lower case,porém jogando a original dentro de uma variável: " + s01);
        System.out.println("**********************SEPARADOR*****************************");
        String meuNome = "ViCeNTe";
        System.out.println("String original: " + meuNome);
        System.out.println("String com lowercase: " + meuNome.toLowerCase());
        System.out.println("**********************SEPARADOR*****************************");
        System.out.println("String original " + original);
        String s02 = original.toUpperCase();
        System.out.println("String com upper case,porém jogando a original dentro de uma variável: " + s02);
        System.out.println("String original: " + meuNome);
        System.out.println("String com upper cas: " + meuNome.toUpperCase());
        System.out.println("**********************SEPARADOR*****************************");
        System.out.println("String original " + original + "-");
        String s03 = original.trim();
        System.out.println("Usando o trim percebe-se através do traço (-) que os espaços são eliminados: " + s03 + "-");
        System.out.println("String original " + original + "-");
        System.out.println("String com o trim: " + original.trim() + "-");
        System.out.println("Continua na próxima classe (Main2)");
    }
}
