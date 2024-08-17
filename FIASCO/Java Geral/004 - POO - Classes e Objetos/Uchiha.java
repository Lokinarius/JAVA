// Herança

public class Uchiha extends Ninja {
    public void sharingan() {
        System.out.println("Sharingan ativado!");
    }

    /* Polimorfismo */
    @Override
    public void ataqueBase() {
        System.out.println(nome + " arremessa uma kunai de fogo!");
    }

    public void ataqueBase(int nivelDeChakra){
        if (nivelDeChakra > 10){
            System.out.println(nome + " ativa o Susanoo");
        } else {
            System.out.println(nome + " não possui chakra suficiente para ativar o Susanoo");
        }
    }
}
