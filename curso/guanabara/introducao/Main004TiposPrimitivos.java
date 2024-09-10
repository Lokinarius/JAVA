package curso.guanabara.introducao;

public class Main004TiposPrimitivos {
    public static void main(String[] args) {

        /* LÓGICOS */
        // BOOLEAN
        boolean isTrue = true;
        boolean isFalse = false;
        // booleans tem somente 1 bit de tamanho e possuem somente dois tipos de resultado
        // "True" e "False"
        System.out.println("Boolean is True: " + isTrue);
        System.out.println("Boolean is False: " + isFalse);

        /* LITERAIS */
        // [CHAR]
        char ch = 'J';
        // char tem o tamanho de 16 bits,ou seja, 1 byte
        // podem representar uma letra, número, símbolo, ou outro caractere especial
        System.out.println("Char: " + ch);
        // [STRING]
        String str = "JAVA";
        // string tem o tamanho de 1 byte cada
        // Strings são imutáveis, não podem ser alteradas após ser criadas
        System.out.println("String: " + str);

        /* INTEIROS */
        // [BYTE]
        byte byteNum = 100;
        // O byte tem o tamanho de 1 byte
        // byte podem armazenar um número de até 127
        System.out.println("Byte: " + byteNum);
        // [SHORT]
        short shortNum = 20000;
        // O short tem o tamanho de 2 bytes
        // short podem armazenar um número de até 32767
        System.out.println("Short: " + shortNum);
        // [INT]
        int intNum = 2000000;
        // O int tem o tamanho de 4 bytes
        // int podem armazenar um número de até 2147483
        System.out.println("Int: " + intNum);
        // [LONG]
        long longNum = 9223372036854775807L;
        // O long tem o tamanho de 8 bytes
        // long podem armazenar um número de até 9223372036854775807, ou 2^63
        // Long é representado usando a letra 'L' ou 'l' ao final do número
        System.out.println("Long: " + longNum);

        /* REAIS */
        // [FLOAT]
        float floatNum = 123.456f;
        // O float tem o tamanho de 4 bytes
        // float pode armazenar um número de até 3.4 x 10^38
        // Float é representado usando a letra 'f' ou 'F' ao final do número
        System.out.println("Float: " + floatNum);
        // [DOUBLE]
        double doubleNum = 123.456;
        // O double tem o tamanho de 8 bytes
        // double pode armazenar um número de até 1.7 x 10^308
        // Double é representado sem a letra 'f' ou 'F' ao final do número
        System.out.println("Double: " + doubleNum);

        // NULL
        // Null é um valor especial que representa ausência de valor
        // Não é um valor primitivo, mas é um tipo primitivo em Java
        // Não pode ser atribuído a uma variável primitiva, apenas a um

    }
}
