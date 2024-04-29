package Modulo7_Memoria_Array_Lista.Aula5_Listas.Exercicio.Entidade;

public class Funcionario {
    private Integer id;
    private String nome;
    private Double salario;

    public Funcionario() {
    }

    public Funcionario(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return this.salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void incrementoDeSalario(double porcentagem) {
        this.salario = this.salario + this.salario * porcentagem / 100.0;
    }

    public String toString() {
        Integer var10000 = this.id;
        return "" + var10000 + ", " + this.nome + ", " + String.format("%.2f", this.salario);
    }
}
