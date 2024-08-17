// Herança

public class Uzumaki extends Ninja {

    boolean bijuu;

    public void chakraInfinito() {
        System.out.println("Uzumakis tem Chakra Infinito");
    }

    /* Polimorfismo */
    @Override
    public void ataqueBase() {
        System.out.println(nome + " arremessa uma kunai de vento!");
    }
}
