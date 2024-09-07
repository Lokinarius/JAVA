package java.fiasco.poo;

public class Main003MetodosEParametros {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            meuNome("William", 28);

        }
    }
    private static void meuNome(String nome, int idade){
        System.out.println("Meu nome é " + nome + " e minha idade é " + idade + " anos.");
    }
}
