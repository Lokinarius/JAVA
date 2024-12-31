package curso.guanabara.poo.Aula011PolimorfismoParte2;

public class Lobo extends Mamifero{
    //[SOBREPOSIÇÃO]
    @Override
    public void emitirSom() {
        System.out.println("Uivado");
    }
}
