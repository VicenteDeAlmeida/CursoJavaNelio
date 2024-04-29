/**
 * polimorfismo é o recurso que
 * permite que variáveis de um mesmo tipo mais genérico possam
 * apontar para objetos de tipos específicos diferentes, tendo assim
 * comportamentos diferentes conforme cada tipo específico
 * */

package Modulo10_Heranca_Polimorfismo.Aula5_IntroducaoAoPolimofirsmo.aplicacao;

import Modulo10_Heranca_Polimorfismo.Aula5_IntroducaoAoPolimofirsmo.entidades.Conta;
import Modulo10_Heranca_Polimorfismo.Aula5_IntroducaoAoPolimofirsmo.entidades.ContaPoupanca;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Conta x = new Conta(1020,"Eu sou titular",1000.0);
        Conta y = new ContaPoupanca(1050,"Vicente",1000.0,0.01);
        /*Aqui enxergamos o polimorfismo: Variáveis do mesmo tipo,porém com comportamentos diferentes*/

        x.saque(50.0);
        y.saque(50.0);

        System.out.println(x.getSaldo());
        System.out.println(y.getSaldo());
    }


    }

