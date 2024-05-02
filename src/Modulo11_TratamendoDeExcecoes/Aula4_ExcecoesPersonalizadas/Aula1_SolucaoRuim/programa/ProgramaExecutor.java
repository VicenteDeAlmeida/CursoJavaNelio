package Modulo11_TratamendoDeExcecoes.Aula4_ExcecoesPersonalizadas.Aula1_SolucaoRuim.programa;

import Modulo11_TratamendoDeExcecoes.Aula4_ExcecoesPersonalizadas.Aula1_SolucaoRuim.modelo.entidades.Reservas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 * Solução ruim: Toda a lógica de validação no programa principal
 * */

public class ProgramaExecutor {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        System.out.print("Número do quarto: ");
        int numeroQuarto = sc.nextInt();

        System.out.print("Data do checkin: ");
        Date dataCheckin = sdf.parse(sc.next());
        System.out.print("Data de checkout: ");
        Date dataCheckout = sdf.parse(sc.next());
        /*Teste para validar se a data do checkout é maior que a do checkin*/
        if (!dataCheckout.after(dataCheckin)){
            System.out.println("A data do checkout não pode ser menor que a data do checkin.");
        }
        else {
            Reservas reservas = new Reservas(numeroQuarto,dataCheckin,dataCheckout);
            System.out.println("Reserva: " + reservas);

            System.out.println();
            System.out.println("Digite a data de atualização da reserva:");
            System.out.print("Data do checkin: ");
            dataCheckin = sdf.parse(sc.next());
            System.out.print("Data de checkout: ");
            dataCheckout = sdf.parse(sc.next());
          //  reservas.atualizaDatas(dataCheckin,dataCheckout);
            /*Teste para validar ser na atualização de datas as datas sõ futuras*/
            Date dataAtual = new Date();
            if (dataCheckin.before(dataAtual) || dataCheckout.before(dataAtual)){
                System.out.println("A atualização de datas só podem ser para datas futuras.");
            }else if (!dataCheckout.after(dataCheckin)){
                System.out.println("A data do checkout não pode ser menor que a data do checkin.");

            }
            else {
                reservas.atualizaDatas(dataCheckin,dataCheckout);
                System.out.println("Reserva: "+ reservas);
            }
        }





        sc.close();
    }
}
