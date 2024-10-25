package curso.fiasco.poo.Unidade02intermediario;

public class Main001Generics {
    public static void main(String[] args) {
        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
        //bolsaNinja.adcionarFerramenta(new Kunai("Kunai Explosiva"));
        bolsaNinja.adcionarFerramenta(new Shuriken(3));
        bolsaNinja.adcionarFerramenta(new Pergaminho("Invocação do sapo"));

        System.out.println("Itens da nossa bolsa:");
        bolsaNinja.mostrarFerramentas();
    }
}
