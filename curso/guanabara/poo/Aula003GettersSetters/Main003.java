package curso.guanabara.poo.Aula003GettersSetters;

public class Main003 {
    public static void main(String[] args) {
        // Caneta c1 = new Caneta();
        //        c1.setModelo("Bic");
        //        // c1.setModelo = "Bic"; // Seria possível pois o atributo é público
        //        c1.setPonta(0.5f);
        //        // c1.setPonta = 0.5f; // Não é possivel pois o atributo é privado
        //        c1.status();
        //        System.out.println("Tenho uma caneta " + c1.getModelo() + "De ponta " + c1.getPonta());
        //        // Acessando os métodos de um objeto da classe Caneta

        Caneta c2 = new Caneta("Compactor","Preta",0.7f); // Criando um objeto
        c2.status();

        Caneta c3 = new Caneta("Bic","vermelha",0.9f);
        c3.status();
    }
}
