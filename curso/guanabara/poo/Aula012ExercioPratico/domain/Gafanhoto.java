package curso.guanabara.poo.Aula012ExercioPratico.domain;

public class Gafanhoto extends Pessoa {
    //[ATRIBUTOS]
    private String login;
    private int totAssistido;
    //[METODOS]
    public void viuMaisUm(){

    }

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
}
