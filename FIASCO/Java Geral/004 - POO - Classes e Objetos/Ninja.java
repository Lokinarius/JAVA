public class Ninja {
    String nome;
    String aldeia;
    int idade;

    /* Getter - Criar getter para mostrar mostrar para o usuário */
    public String getNome() {
        return nome;
    }

    /* Setter - Settar o valor da variável */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void ataqueBase(){
        System.out.println(nome + " arremessa uma kunai!");
    }
}
