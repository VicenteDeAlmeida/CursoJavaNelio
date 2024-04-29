package Modulo7_Memoria_Array_Lista.Aula5_Listas.Aulas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Listas4 {

    public static void main(String[] args) {
        List<String> listaString = new ArrayList();
        listaString.add("Marcos");
        listaString.add("Roberto");
        listaString.add("Maria");
        listaString.add("Murilo");
        listaString.add("Vicente");
        listaString.add("Isolda");
        Iterator var2 = listaString.iterator();

        String name;
        while(var2.hasNext()) {
            name = (String)var2.next();
            System.out.println(name);
        }

        System.out.println("-------------------------------------------");
        List resultado = (List)listaString.stream().filter((xx) -> {
            return xx.charAt(0) == 'M';
        }).collect(Collectors.toList());
        Iterator var6 = resultado.iterator();

        while(var6.hasNext()) {
            String x = (String)var6.next();
            System.out.println(x);
        }

        System.out.println("-------------------------------------------");
        name = (String)listaString.stream().filter((xx) -> {
            return xx.charAt(0) == 'M';
        }).findFirst().orElse((String) null);
        System.out.println(name);
    }
}
