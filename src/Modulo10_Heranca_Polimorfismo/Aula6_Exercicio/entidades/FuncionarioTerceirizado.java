package Modulo10_Heranca_Polimorfismo.Aula6_Exercicio.entidades;

public class FuncionarioTerceirizado extends Funcionario {

    Double bonusAdicional;

    public FuncionarioTerceirizado(){
        super();
    }

    public FuncionarioTerceirizado(String nome, Integer horas, Double valorPorHoras, Double bonusAdicional) {
        super(nome, horas, valorPorHoras);
        this.bonusAdicional = bonusAdicional;
    }

    public Double getBonusAdicional() {
        return bonusAdicional;
    }

    public void setBonusAdicional(Double bonusAdicional) {
        this.bonusAdicional = bonusAdicional;
    }
    @Override
    public Double pagamento(){
        return super.pagamento() + bonusAdicional * 1.1;
    }
}
