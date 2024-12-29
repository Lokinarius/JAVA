package curso.guanabara.poo.Aula010Polimorfismo;

public class Ave extends Animal{
    //[ATRIBUTOS]
    private char corPena;

    //[SOBREPOSIÇÃO]
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Ave");
    }

    //[METODOS]
    public void fazerNinho(){
        System.out.println("Construiu um ninho");
    }
}
