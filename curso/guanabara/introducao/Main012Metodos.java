package curso.guanabara.introducao;

public class Main012Metodos {
    // METODOS EM JAVA
    static int soma(int a, int b){
        int s = a + b;
        return s;
    }

    public static void main(String[] args) {
        int resultado = soma(10, 5);
        System.out.println("Resultado: " + resultado);
    }
}
