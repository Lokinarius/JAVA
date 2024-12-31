package curso.guanabara.poo.Aula011PolimorfismoParte2;

public class Mamifero extends Animal{
    //[ATRIBUTOS]
    protected String corPelo;

    //[SOBREPOSIÇÃO]
    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero");
    }
}
