package Modulo5_OrientacaoAObjetos.Aula7_Exercicios.Exercicio2.Aplicacao;

import Modulo5_OrientacaoAObjetos.Aula7_Exercicios.Exercicio2.Entidades.Funcionario;
import java.util.Locale;
import java.util.Scanner;

public class FuncionarioTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        System.out.println("Digite o nome do funcionário!");
        funcionario.nome = sc.nextLine();
        System.out.println("Digite o seu salário bruto!");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.println("Digite a taxa de imposto!");
        funcionario.imposto = sc.nextDouble();
        System.out.printf("Nome: %s%nSalário Bruto: %.2f%nImposto: %.2f%n", funcionario.nome, funcionario.salarioBruto, funcionario.imposto);
        System.out.printf("Funcionário: %s, R$ %.2f%n", funcionario.nome, funcionario.salarioLiquido());
        System.out.println("Em quantos por cento você deseja aumentar o salário do funcionário?");
        double porcentagem = sc.nextDouble();
        funcionario.incrementoSalario(porcentagem);
        System.out.println(funcionario);
        sc.close();
    }
}
