//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Modulo8_DataEHora.Aula3_CalculosComDataEHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosComDataHora {
    public CalculosComDataHora() {
    }

    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        System.out.println("Pegando a data de d04 e subtraindo 7 sete dias,no caso menos uma semana");
        LocalDate semanaAnterior = d04.minusDays(7L);
        System.out.println(semanaAnterior);
        System.out.println("Pegando a data de d04 e adicionando 7 sete dias,no caso mais uma semana");
        LocalDate proximaSemana = d04.plusDays(7L);
        System.out.println(proximaSemana);
        System.out.println("Agora usando o LocalDateTime com o d05");
        LocalDateTime semanaAnt = d05.minusDays(7L);
        LocalDateTime maisUmaSemana = d05.plusDays(7L);
        System.out.println(semanaAnt);
        System.out.println(maisUmaSemana);
        System.out.println("Agora usando o Instant com o d06");
        Instant menosSeteDias = d06.minus(7L, ChronoUnit.DAYS);
        Instant maisSeteDias = d06.plus(7L, ChronoUnit.DAYS);
        System.out.println(menosSeteDias);
        System.out.println(maisSeteDias);
        System.out.println("Calculando espaço de tempo entre datas");
        Duration tempo1 = Duration.between(semanaAnt, d05);
        System.out.println("tempo 1 dias = " + tempo1.toDays());
        System.out.println("LocalDate eu não posso usar pq ele não suporta (gera exception),então eu preciso converter");
        System.out.println("Calculando com LocalDate,usando a conversão");
        Duration tempo2 = Duration.between(semanaAnterior.atStartOfDay(), d04.atStartOfDay());
        System.out.println(tempo2.toDays() + " dias.");
    }
}
