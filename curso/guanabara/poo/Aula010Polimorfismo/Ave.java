package curso.guanabara.poo.Aula010Polimorfismo;

public class Ave extends Animal{
    //Atributos
    private char corPena;

    //Sobreposição
    @Override
    public void locomover() {
        super.locomover();
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        super.alimentar();
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("Som de Ave");
    }

    //Metodos
    public void fazerNinho(){
        System.out.println("Construiu um ninho");
    }
}
