package curso.guanabara.poo.Aula010Polimorfismo;

import java.sql.SQLOutput;

public class Mamifero extends Animal{
    //[ATRIBUTOS]
    private char corPelo;

    //[SOBREPOSIÇÃO]
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamamndo");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero");
    }
}
