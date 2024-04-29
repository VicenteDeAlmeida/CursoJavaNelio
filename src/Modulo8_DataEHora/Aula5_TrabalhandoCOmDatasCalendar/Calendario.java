package Modulo8_DataEHora.Aula5_TrabalhandoCOmDatasCalendar;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Calendario {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println(sdf.format(d));
        System.out.println("Acrescentando 4 horas nessa data");
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(11, 4);
        d = cal.getTime();
        System.out.println(sdf.format(d));
        System.out.println("Pegando unidade de tempo,nesse caso segundos");
        int minutos = cal.get(12);
        System.out.println("Minutos: " + minutos);
        int mes = 1 + cal.get(2);
        System.out.println(mes);
    }
}
