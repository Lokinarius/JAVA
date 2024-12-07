package curso.guanabara.poo.Aula009Heranca;

public class Professor extends Pessoa {
    // Atributos
    private String especialidade;
    private float salario;

    // Metodo
    public void receberAumento(float aum){
        this.salario += aum;
    }

    // Construtor
    public Professor(String nome, int idade, String sexo, String especialidade, float salario) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    // Getters e Setters
    public String getEspecialidade() {return especialidade;}
    public void setEspecialidade(String especialidade) {this.especialidade = especialidade;}

    public float getSalario() {return salario;}
    public void setSalario(float salario) {this.salario = salario;}
}
