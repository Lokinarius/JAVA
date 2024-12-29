package curso.guanabara.poo.Aula010Polimorfismo;

public class Reptil extends Animal {
    //Atributos
    private char corEscama;

    //Overrride

    @Override
    public void locomover() {
        super.locomover();
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        super.alimentar();
        System.out.println("Comendo pequenos animais");
    }

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("Som de Réptil");
    }
}
