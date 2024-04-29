package Modulo7_Memoria_Array_Lista.Aula5_Listas.Aulas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listas3 {

    public static void main(String[] args) {
        List<String> listaString = new ArrayList();
        listaString.add("Marcos");
        listaString.add("Roberto");
        listaString.add("Maria");
        listaString.add("Murilo");
        listaString.add("Vicente");
        listaString.add("Isolda");
        Iterator var2 = listaString.iterator();

        String x;
        while(var2.hasNext()) {
            x = (String)var2.next();
            System.out.println(x);
        }

        System.out.println("--------------------------------");
        listaString.removeIf((xx) -> {
            return xx.charAt(0) == 'M';
        });
        var2 = listaString.iterator();

        while(var2.hasNext()) {
            x = (String)var2.next();
            System.out.println(x);
        }

        System.out.println("--------------------------------");
        System.out.println("Posição do Roberto " + listaString.indexOf("Roberto"));
    }
}
