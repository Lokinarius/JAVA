package curso.guanabara.poo.Aula010Polimorfismo;

public class Cachorro extends Mamifero{
    //[SOBREPOSIÇÃO]
    @Override
    public void emitirSom() {
        System.out.println("Latindo");
    }

    //[METODOS]
    public void esconderOsso(){
        System.out.println("Escondendo o osso");
    }

}
