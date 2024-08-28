public class MainOperadoresAritméticos {
    public static void main(String[] args) {
        /* OPERADORES ARITMÉTICOS */

        int a = 5;
        int b = 3;

        // Adição
        // +
        int soma = a + b;
        System.out.println("Soma: " + soma);

        // Subtração
        // -
        int subtracao = a - b;
        System.out.println("Subtração: " + subtracao);

        // Multiplicação
        // *
        int multiplicacao = a * b;
        System.out.println("Multiplicação: " + multiplicacao);

        // Divisão
        // /
        double divisao = (double) a / b;
        System.out.println("Divisão: " + divisao);

        // Exponenciação
        // Math.pow()
        int exponenciacao = (int) Math.pow(a, b);
        System.out.println("Exponenciação: " + exponenciacao);

        // Raiz
        // Math.sqrt()
        double raiz = Math.sqrt(a);
        System.out.println("Raiz quadrada: " + raiz);

        // Módulo (resto da divisão)
        int modulo = a % b;
    }
}
