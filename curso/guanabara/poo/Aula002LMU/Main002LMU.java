package curso.guanabara.poo.Aula002LMU;

public class Main002LMU {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.modelo = "Bic";
        //c1.ponta = 0.9f; Como o atributo está privado, ele não pode ser chamado
        c1.carga = 50;
        c1.status();
    }
}
