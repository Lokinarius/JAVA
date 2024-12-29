package curso.guanabara.poo.Aula010Polimorfismo;

import java.sql.SQLOutput;

public class Mamifero extends Animal{
    //[ATRIBUTOS]
    private char corPelo;

    //[OVERRIDE]
    @Override
    public void locomover() {
        super.locomover();
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        super.alimentar();
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("Som de mamífero");
    }
}
