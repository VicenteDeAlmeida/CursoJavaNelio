package Modulo11_TratamendoDeExcecoes.Aula6_ExcecoesPersonalizadas.Aula3_SolucaoBoa.programa;

import Modulo11_TratamendoDeExcecoes.Aula6_ExcecoesPersonalizadas.Aula3_SolucaoBoa.model.exceptions.ClasseException;
import Modulo11_TratamendoDeExcecoes.Aula6_ExcecoesPersonalizadas.Aula3_SolucaoBoa.modelo.entidades.Reservas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Solução mais ou menos: método retornando string
 * Ainda não há tratamento de exceções
 * */

public class ProgramaExecutor {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.print("Número do quarto: ");
            int numeroQuarto = sc.nextInt();

            System.out.print("Data do checkin: ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Data de checkout: ");
            Date checkOut = sdf.parse(sc.next());
            Reservas reservas = new Reservas(numeroQuarto, checkIn, checkOut);
            System.out.println("Reserva: " + reservas);
            System.out.println();
            System.out.println("Digite a data de atualização da reserva:");
            System.out.print("Data do checkin: ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Data de checkout: ");
            checkOut = sdf.parse(sc.next());
            reservas.atualizaDatas(checkIn, checkOut);
        }
        catch (ParseException data){
            System.out.println("Você digitou uma data inválida!!");
        }
        catch (ClasseException data){
            System.out.println("Erro na reserva: "+ data.getMessage());
        }
        catch (InputMismatchException quarto){
            System.out.println("Valor inválido para o número do quarto!");
        }

        sc.close();
        }

    }

