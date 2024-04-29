//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Modulo8_DataEHora.Aula2_ConvertendoDataHoraGlobalParaLocal;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConvertendoDataHoraLocalParaGlobal {

    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        System.out.println("Convertendo o instant para uma data local considerando a data do computador do usuário.");
        LocalDate resultado1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate resultado2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime resultado3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime resultado4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
        System.out.println("Não esquecer que a variável d06 é de Londres que tem três horas antes em relação ao Brasil: " + resultado1);
        System.out.println("Agora o fuso com relação a Portugal: " + resultado2);
        System.out.println("Agora vou pegar o DateTime local e depois o de Portugal que é uma hora a mais");
        System.out.println("Date Time Local = " + resultado3);
        System.out.println("Date Time de Portugal = " + resultado4);
        System.out.println("Pegando agora somente o dia de uma data Local");
        System.out.println("d04 = " + d04.getDayOfMonth());
        System.out.println("Pegando agora somente o més de uma data Local");
        System.out.println("d05 = " + d05.getMonth());
        System.out.println("Pegando agora somente o més porém com o valor");
        System.out.println("d05= " + d05.getMonthValue());
        System.out.println("Pegando agora o ano da data");
        System.out.println("do5= " + d05.getYear());
        System.out.println("Pegando agora a hora");
        System.out.println("d05 = " + d05.getHour());
        System.out.println("Pegando agora o minuto");
        System.out.println("d05 = " + d05.getMinute());
    }
}
