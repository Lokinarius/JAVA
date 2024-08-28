public class MainOperadoresAritmeticos {
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

        // Módulo (resto da divisão)
        // %
        int modulo = a % b;
        System.out.println("Módulo: " + modulo);

        /* OPERADORES UNÁRIOS */

        // Incremento
        // ++
        a++;
        System.out.println("Incremento: " + a);

        // Decremento
        // --
        a--;
        System.out.println("Decremento: " + a);

        /* OPERADORES DE ATRIBUIÇÃO */

        // Somar e atribuir
        // +=
        a += 5;
        System.out.println("Soma unária: " + a);

        // Subtrair e atribuir
        // -=
        a -= 5;
        System.out.println("Subtração unária: " + a);

        // Multiplicar e atribuir
        // *=
        a *= 5;
        System.out.println("Multiplicação unária: " + a);

        // Dividir e atribuir
        // /=
        a /= 5;
        System.out.println("Divisão unária: " + a);

        // Resto e atribuir
        // %=
        a %= 5;
        System.out.println("Módulo unário: " + a);


        /* CLASSE MATH */

        // Exponenciação
        // Math.pow()
        int exponenciacao = (int) Math.pow(5, 2);
        System.out.println("Exponenciação: " + exponenciacao);

        // Raiz
        // Math.sqrt()
        double raiz = Math.sqrt(a);
        System.out.println("Raiz quadrada: " + raiz);

        // Arredondamento para cima
        // Math.ceil()
        double arredondadoCima = Math.ceil(divisao);
        System.out.println("Arredondado para cima: " + arredondadoCima);

        // Arredondamento para baixo
        // Math.floor()
        double arredondadoBaixo = Math.floor(divisao);
        System.out.println("Arredondado para baixo: " + arredondadoBaixo);

        // Arredondamento aritimético
        // Math.round()
        int arredondadoAritmetico = (int) Math.round(divisao);
        System.out.println("Arredondado aritmético: " + arredondadoAritmetico);
        
        // Random
        // Math.random()
        double numeroAleatorio = Math.random() * 100;
        System.out.println("Número aleatório: " + numeroAleatorio);


    }
}
