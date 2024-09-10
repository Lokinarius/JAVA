package java.guanabara.introducao;

public class Main005OperadoresLógicoseRelacionais {
    public static void main(String[] args) {
        // Operadores lógicos e relacionais
        boolean a = true;
        boolean b = false;
        int c = 5;
        int d = 3;

        System.out.println("Operadores lógicos");
        System.out.println("AND / E");
        System.out.println("a && b = " + (a && b)); // false
        System.out.println("OR / OU");
        System.out.println("a || b = " + (a || b)); // true
        System.out.println("NÃO / NEGADO");
        System.out.println("!a = " + (!a)); // false
        System.out.println("\n");

        System.out.println("Operadores Relacionais");
        System.out.println("Maior que");
        System.out.println("c > d = " + (c > d)); // false
        System.out.println("Menor que");
        System.out.println("c < d = " + (c < d)); // true
        System.out.println("Maior ou igual");
        System.out.println("c >= d = " + (c >= d)); // false
        System.out.println("Menor ou igual");
        System.out.println("c <= d = " + (c <= d)); // true
        System.out.println("Igual");
        System.out.println("c == d = " + (c == d)); // false
        System.out.println("Diferente");
        System.out.println("c!= d = " + (c!= d)); // true


    }
}
