package curso.guanabara.poo.Aula007Agregacao;

public class Luta {
    // [ATRIBUTOS]
    private String desafiado;
    private String desafiante;
    private int rounds;
    private boolean aprovada;

    // [METODOS]]
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1 != l2){
            this.aprovada = true;
        }

    }
    public void lutar(){

    }

    // [GETTERS E SETTERS]

    public String getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(String desafiado) {
        this.desafiado = desafiado;
    }

    public String getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(String desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
