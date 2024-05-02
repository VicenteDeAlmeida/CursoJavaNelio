package Modulo11_TratamendoDeExcecoes.Aula2_SolucaoMaisOuMenos.programa;

import Modulo11_TratamendoDeExcecoes.Aula2_SolucaoMaisOuMenos.entidades.Reservas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 * Solução mais ou menos: método retornando string
 * Ainda não há tratamento de exceções
 * */

public class ProgramaExecutor {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        System.out.print("Número do quarto: ");
        int numeroQuarto = sc.nextInt();

        System.out.print("Data do checkin: ");
        Date checkIn = sdf.parse(sc.next());
        System.out.print("Data de checkout: ");
        Date checkOut = sdf.parse(sc.next());
        /*Teste para validar se a data do checkout é maior que a do checkin*/
        if (!checkOut.after(checkIn)){
            System.out.println("A data do checkout não pode ser menor que a data do checkin.");
        }
        else {
            Reservas reservas = new Reservas(numeroQuarto,checkIn,checkOut);
            System.out.println("Reserva: " + reservas);

            System.out.println();
            System.out.println("Digite a data de atualização da reserva:");
            System.out.print("Data do checkin: ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Data de checkout: ");
            checkOut = sdf.parse(sc.next());
           String erro =  reservas.atualizaDatas(checkIn,checkOut);
           if (erro != null){
               System.out.println("Erro na reserva:" + erro);
           }
           else {
               System.out.println("Reserva: "+ reservas);
           }


            }
        sc.close();
        }

    }

