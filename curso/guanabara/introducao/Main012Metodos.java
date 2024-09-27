package curso.guanabara.introducao;

public class Main012Metodos {
    // METODOS EM JAVA
    public static void soma(int a, int b) {
        int s = a + b;
        System.out.println("O resultado da soma entre " + a + " e " + b + " é " + s);
    }
    public static void main(String[] args) {
        // Invocando um metodo
        soma(5, 10);
    }
}
