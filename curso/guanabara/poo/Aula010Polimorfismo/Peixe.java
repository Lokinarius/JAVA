package curso.guanabara.poo.Aula010Polimorfismo;

public class Peixe extends Animal{
    //[ATRIBUTOS]
    private char corEscama;

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
}
