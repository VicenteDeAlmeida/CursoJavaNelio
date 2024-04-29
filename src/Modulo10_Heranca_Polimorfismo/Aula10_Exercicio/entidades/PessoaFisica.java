package Modulo10_Heranca_Polimorfismo.Aula10_Exercicio.entidades;

public class PessoaFisica extends Contribuinte {

    private Double gastosComSaude;

    public PessoaFisica(){
        super();

    }
    public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude) {
        super(nome, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public Double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(Double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public double imposto() {
        double impostoBasico;
        if (getRendaAnual() < 20000.0){
            impostoBasico = getRendaAnual() * 0.15;
        }else {
            impostoBasico = getRendaAnual() *0.25;
        }

        impostoBasico -= getGastosComSaude() * 0.5;

        if (impostoBasico < 0.0){
            impostoBasico = 0.0;
        }
        return impostoBasico;


    }
}
