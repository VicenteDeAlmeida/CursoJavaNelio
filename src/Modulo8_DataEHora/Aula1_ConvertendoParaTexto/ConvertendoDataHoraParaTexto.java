//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Modulo8_DataEHora.Aula1_ConvertendoParaTexto;

import java.io.PrintStream;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ConvertendoDataHoraParaTexto {
    public ConvertendoDataHoraParaTexto() {
    }

    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        System.out.println("Imprimindo normalmente:");
        System.out.println("d04 = " + d04);
        System.out.println("Agora usando uma formatação padrão de data:");
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        PrintStream var10000 = System.out;
        String var10001 = d04.format(fmt1);
        var10000.println("d04 = " + var10001);
        System.out.println("Chamando de outra forma,porém com o mesmo resultado");
        var10000 = System.out;
        var10001 = fmt1.format(d04);
        var10000.println("d04 = " + var10001);
        System.out.println("Com a variável d05 vamos usar dois formatters,nesse caso a data e a hora");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        var10000 = System.out;
        var10001 = d05.format(fmt2);
        var10000.println("d05 " + var10001);
        System.out.println("Poderia também formatar apenas a data usando a varável fmt1");
        var10000 = System.out;
        var10001 = d05.format(fmt1);
        var10000.println("d05= " + var10001);
        System.out.println("Agora para usar o isntant eu preciso declarar para o Java pegar a data e horário dosistema que o usuário está utilizando.Nesse caso ele vai pegar 3 horas a menos conforme o fuso horáriodo Brasil comparado a Londres");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        var10000 = System.out;
        var10001 = fmt3.format(d06);
        var10000.println("d06 = " + var10001);
    }
}
