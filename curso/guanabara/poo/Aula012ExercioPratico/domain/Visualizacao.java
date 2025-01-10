package curso.guanabara.poo.Aula012ExercioPratico.domain;

public class Visualizacao {
    //[ATRIBUTOS]
    private Gafanhoto espectador;
    private Video filme;

    //[CONSTRUTOR]
    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    //[METODOS]
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(double porc){
        int tot = 0;
        if (porc <= 20){
            tot = 3;
        }else if(porc <= 50){
            tot = 5;
        }else if(porc <= 90){
            tot = 8;
        }else{
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }

    //[GETTER E SETTERS]
    public Gafanhoto getEspectador() {return espectador;}
    public void setEspectador(Gafanhoto espectador) {this.espectador = espectador;}

    public Video getFilme() {return filme;}
    public void setFilme(Video filme) {this.filme = filme;}
}
