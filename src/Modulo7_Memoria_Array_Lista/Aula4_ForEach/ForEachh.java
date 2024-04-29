package Modulo7_Memoria_Array_Lista.Aula4_ForEach;

public class ForEachh {
    public static void main(String[] args) {
        String[] vect = new String[]{"Maria", "Bob", "Alex"};

        for(int i = 0; i < vect.length; ++i) {
            System.out.println(vect[i]);
        }

        System.out.println("-------------------------------");
        String[] var6 = vect;
        int var3 = vect.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            String obj = var6[var4];
            System.out.println(obj);
        }

    }
}
