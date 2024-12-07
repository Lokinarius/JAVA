package curso.guanabara.poo.Aula009Heranca;

public class Aluno extends Pessoa{
    // Atributos
    private int matricula;
    private String curso;

    // Metodos
    public void  cancelarMatr(){
        System.out.println("Matricula será cancelada!");
    }

    // Construtor
    public Aluno(String nome, int idade, String sexo, int matricula, String curso) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }

    // Getters e Setters
    public int getMatricula() {return matricula;}
    public void setMatricula(int matricula) {this.matricula = matricula;}

    public String getCurso() {return curso;}
    public void setCurso(String curso) {this.curso = curso;}
}
