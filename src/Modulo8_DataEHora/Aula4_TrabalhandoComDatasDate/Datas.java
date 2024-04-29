package Modulo8_DataEHora.Aula4_TrabalhandoComDatasDate;

import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Datas {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date x1 = new Date();
        Date y1 = sdf1.parse("25/06/2018");
        Date y2 = sdf2.parse("25/06/2018 15:42:07");
        System.out.println(sdf2.format(y1));
        System.out.println(sdf2.format(y2));
        PrintStream var10000 = System.out;
        String var10001 = sdf2.format(x1);
        var10000.println("Data com o horário atual " + var10001);
    }
}
