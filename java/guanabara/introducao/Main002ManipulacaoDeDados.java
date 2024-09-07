package java.guanabara.introducao;// Importando Scanner
import java.util.Scanner;
public class Main002ManipulacaoDeDados {
    public static void main(String[] args) {
        // Criando um Scanner para ler dados do teclado
        Scanner scanner = new Scanner(System.in);

        // Lendo um inteiro do teclado
        System.out.print("Digite um inteiro: ");
        int numero = scanner.nextInt();

        // Lendo um flutuante do teclado
        System.out.print("Digite um float: ");
        float decimal = scanner.nextFloat();

        // Lendo uma string do teclado
        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine();

        // Mostrando os dados lidos
        System.out.println("Inteiro: " + numero);
        System.out.println("Decimal: " + decimal);
        System.out.println("Texto: " + texto);

        // Fechando o Scanner
        scanner.close();

        // Criando um novo Scanner para ler dados do teclado
        Scanner teclado = new Scanner(System.in);

        // Convertendo de um tipo para outro
        System.out.print("Digite sua idade: ");
        int idade = teclado.nextInt();
        String idadeLiteral = Integer.toString(idade);
        System.out.println("Sua idade em texto é: " + idadeLiteral);
        teclado.close();
    }
}
