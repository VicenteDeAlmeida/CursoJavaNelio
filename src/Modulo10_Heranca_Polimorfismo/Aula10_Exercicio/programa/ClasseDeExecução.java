package Modulo10_Heranca_Polimorfismo.Aula10_Exercicio.programa;

import Modulo10_Heranca_Polimorfismo.Aula10_Exercicio.entidades.Contribuinte;
import Modulo10_Heranca_Polimorfismo.Aula10_Exercicio.entidades.PessoaFisica;
import Modulo10_Heranca_Polimorfismo.Aula10_Exercicio.entidades.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ClasseDeExecução {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Contribuinte> listaContribuintes = new ArrayList<>();
        System.out.print("Digite o número de contribuintes: ");
        int contribuintes = sc.nextInt();

        for (int i = 1 ; i <=contribuintes;i++){
            System.out.println("Digite os dados do contribuinte " + i + ":");
            System.out.print("Pessoa Física ou Jurídica? ");
            String pessoa = sc.next();
            System.out.print("Nome? ");
            String nome = sc.next();
            System.out.print("Renda anual? ");
            Double renda = sc.nextDouble();
            if (pessoa.equalsIgnoreCase("Fisica")){
                System.out.print("Despesas com saúde: ");
                double despesasComSaude = sc.nextDouble();
                listaContribuintes.add(new PessoaFisica(nome,renda,despesasComSaude));
            } else if (pessoa.equalsIgnoreCase("Juridica")) {
                System.out.print("Número de funcionários: ");
                int numeroFuncionarios = sc.nextInt();
                listaContribuintes.add(new PessoaJuridica(nome,renda,numeroFuncionarios));

            }else {
                System.out.println("Você digitou um valor inválido");
            }
        }
        System.out.println("Impostos Pagos:");
        for (Contribuinte contribuinte : listaContribuintes){
            System.out.println(contribuinte.taxasPagas());
        }

        double soma = 0.0;
        for (Contribuinte contribuinte : listaContribuintes){
            soma += contribuinte.imposto();
        }
        System.out.println("Total de impostos pagos: " + String.format("R$%.2f",soma));

        sc.close();
    }
}
