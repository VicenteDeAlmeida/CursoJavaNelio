package Modulo11_TratamendoDeExcecoes.Aula5_ExcecoesPersonalizdas.Aula2_SolucaoMaisOuMenos.entidades;

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

    public String atualizaDatas(Date checkIn,Date checkOut){
        Date dataAtual = new Date();
        if (checkIn.before(dataAtual) || checkOut.before(dataAtual)){
          return "A atualização de datas só podem ser para datas futuras.";
        }
        if (!checkOut.after(checkIn)){
            return "A data do checkout não pode ser menor que a data do checkin.";

        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;

        return null;
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
