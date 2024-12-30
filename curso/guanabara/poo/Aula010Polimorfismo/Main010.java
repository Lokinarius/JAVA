package curso.guanabara.poo.Aula010Polimorfismo;

public class Main010 {
    public static void main(String[] args) {
        //[OBJETOS]
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        Canguru K = new Canguru();
        Cachorro d = new Cachorro();
        Cobra s = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara b = new Arara();

        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();

        a.setPeso(2.46f);
        a.setCorPena("Azul");
        a.locomover();
        a.alimentar();
        a.emitirSom();

    }
}
