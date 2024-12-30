package curso.guanabara.poo.Aula010Polimorfismo;

public class Canguru extends Mamifero{
    //[SOBREPOSIÇÃO]
    @Override
    public void locomover() {
        System.out.println("Saltando");
    }

    //[METODOS]
    public void usarBolsa(){
        System.out.println("Usando Bolsa");
    }
}
