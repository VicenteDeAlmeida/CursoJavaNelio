package Modulo11_TratamendoDeExcecoes.Aula4_ExcecoesPersonalizadas.Aula1_SolucaoRuim.modelo.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservas {
    private Integer numeroQuarto;

    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservas(Integer numeroQuarto, Date checkIn, Date checkOut) {
        this.numeroQuarto = numeroQuarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(Integer numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public Date getCheckin() {
        return checkIn;
    }
    public Date getCheckout() {
        return checkOut;
    }



    public long duracao(){
        long diferenca = checkOut.getTime() - checkIn.getTime();
       return TimeUnit.DAYS.convert(diferenca,TimeUnit.MILLISECONDS);
       /*Método para calcular a duração em dias das datas de checkout e checkin*/
    }

    public void atualizaDatas(Date checkIn,Date checkOut){
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
    @Override
    public String toString(){
        return "Quarto "
                + numeroQuarto
                + ", check-in "
                + sdf.format(checkIn)
                + ", check-out "
                + sdf.format(checkOut)
                + ", "
                + duracao()
                + " noites.";

    }
}
