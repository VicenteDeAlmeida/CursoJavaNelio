package Modulo7_Memoria_Array_Lista.Aula5_Listas.Aulas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listas1 {

    public static void main(String[] args) {
        List<Integer> listaInteiros = new ArrayList();
        listaInteiros.add(1);
        listaInteiros.add(2);
        listaInteiros.add(3);
        listaInteiros.add(5);
        listaInteiros.add(6);
        listaInteiros.add(3, 4);
        System.out.println(listaInteiros.size());
        Iterator var2 = listaInteiros.iterator();

        while(var2.hasNext()) {
            Integer lista = (Integer)var2.next();
            System.out.println(lista);
        }

    }
}
