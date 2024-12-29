package curso.guanabara.poo.Aula010Polimorfismo;

public class Reptil extends Animal {
    //[ATRIBUTOS]
    private char corEscama;

    //[SOBREPOSIÇÃO]

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo pequenos animais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Réptil");
    }
}
