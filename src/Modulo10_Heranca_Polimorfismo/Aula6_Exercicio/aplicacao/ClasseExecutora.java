package Modulo10_Heranca_Polimorfismo.Aula6_Exercicio.aplicacao;

import Modulo10_Heranca_Polimorfismo.Aula6_Exercicio.entidades.Funcionario;
import Modulo10_Heranca_Polimorfismo.Aula6_Exercicio.entidades.FuncionarioTerceirizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ClasseExecutora {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        List<Funcionario> list = new ArrayList<>();

        System.out.print("Digite o número de funcionários: ");
        int numeroFuncionario = scanner.nextInt();


        for (int i = 1; i<= numeroFuncionario;i++){
            System.out.println("Digite os dados do funcionário " + i + ":");
            System.out.print("Terceirizado? (Sim/Não) ");
            String terceirizado = scanner.next();
            scanner.nextLine();
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Horas trabalhadas? ");
            Integer horas = scanner.nextInt();
            System.out.print("Valor por horas? ");
            Double valorHoras = scanner.nextDouble();
            if (terceirizado.equalsIgnoreCase("Sim")){
                System.out.print("Qual é o adicional de bônus? ");
                Double bonus = scanner.nextDouble();
                list.add(new FuncionarioTerceirizado(nome,horas,valorHoras,bonus));
            }else {
                list.add(new Funcionario(nome,horas,valorHoras));
            }

        }
        System.out.println("PAGAMENTOS: ");
        for (Funcionario func : list){
            System.out.println(func.getNome() + " - $ "+ func.pagamento());
        }



        scanner.close();
    }
}
