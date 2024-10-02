package curso.guanabara.poo.Aula001Classes;

public class Main001Classes {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul"; // chamada para atributo
        c1.modelo = "Bic"; // chamada para atributo
        c1.ponta = 0.9f; // chamada para atributo
        c1.carga = 50; // chamada para atributo
        c1.destampar(); //chamada para métodos

        c1.status(); // chamada para métodos
        c1.rabiscar(); // chamada para métodos

        // Criando uma nova caneta
        Caneta c2 = new Caneta();
        c2.cor = "Vermelha"; // chamada para atributo
        c2.modelo = "Compactor"; // chamada para atributo
        c2.ponta = 0.7f; // chamada para atributo
        c2.carga = 70; // chamada para atributo
        c2.tampar(); // chamada para métodos

        c2.status(); // chamada para métodos
        c2.rabiscar(); // chamada para métodos



    }
}
