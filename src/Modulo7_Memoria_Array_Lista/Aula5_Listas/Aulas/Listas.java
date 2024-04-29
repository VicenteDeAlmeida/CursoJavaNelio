package Modulo7_Memoria_Array_Lista.Aula5_Listas.Aulas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listas {

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("Maria");
        list.add("Pedro");
        list.add("João");
        list.add("Bob");
        Iterator var2 = list.iterator();

        while(var2.hasNext()) {
            String elementosLista = (String)var2.next();
            System.out.println(elementosLista);
        }

    }
}
