package Modulo7_Memoria_Array_Lista.Aula5_Listas.Aulas;

import java.util.ArrayList;
import java.util.List;

public class Listas2 {

    public static void main(String[] args) {
        List<Double> listaDouble = new ArrayList();
        listaDouble.add(25.9);
        listaDouble.add(21.43);
        listaDouble.add(100.34);
        listaDouble.add(30.54);
        listaDouble.add(10.9);
        listaDouble.remove(100.34);
        listaDouble.remove(1);
        System.out.println(listaDouble);
    }
}
