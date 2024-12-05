package curso.guanabara.poo.Aula008ExercicioPratico.domain;

public class Pessoa {
    // [ATRIBUTOS]
    private String nome;
    private int idade;
    private String sexo;

    // [METODOS]
    public void fazerAniver(){
        this.idade++;
    }

    // [CONSTRUTOR]
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    // [GETTERS E SETTERS]
    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }

    public void setIdade(int idade) { this.idade = idade; }

    public String getSexo() { return sexo; }

    public void setSexo(String sexo) { this.sexo = sexo; }
}
