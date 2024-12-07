package curso.guanabara.poo.Aula009Heranca;

public class Funcionario extends Pessoa {
    // Atributos
    private String setor;
    private boolean trabalhando;

    // Metodos
    public void mudarTrabalho(){
        this.trabalhando =! this.trabalhando;
    }

    // Construtor
    public Funcionario(String nome, int idade, String sexo, String setor, boolean trabalhando) {
        super(nome, idade, sexo);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }

    // Getters e Setters
    public String getSetor() {return setor;}
    public void setSetor(String setor) {this.setor = setor;}

    public boolean getTrabalhando() {return trabalhando;}
    public void setTrabalhando(boolean trabalhando) {this.trabalhando = trabalhando;}
}
