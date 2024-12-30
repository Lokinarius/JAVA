package curso.guanabara.poo.Aula010Polimorfismo;

public class Peixe extends Animal{
    //[ATRIBUTOS]
    private String corEscama;

    //[SOBREPOSIÇÃO]
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendando Substancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }

    //[METODOS]
    public void soltarBolha(){
        System.out.println("soltou uma bolha");
    }

    //[GETTERS E SETTERS]
    public String getCorEscama() {return corEscama;}
    public void setCorEscama(String corEscama) {this.corEscama = corEscama;}
}
