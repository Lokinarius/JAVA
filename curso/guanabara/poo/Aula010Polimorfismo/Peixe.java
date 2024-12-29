package curso.guanabara.poo.Aula010Polimorfismo;

public class Peixe extends Animal{
    //Atributos
    private char corEscama;

    //Sobreposição

    @Override
    public void locomover() {
        super.locomover();
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        super.alimentar();
        System.out.println("Comendando Substancias");
    }

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("Peixe não faz som");
    }

    //Metodos
    public void soltarBolha(){
        System.out.println("soltou uma bolha");
    }
}
