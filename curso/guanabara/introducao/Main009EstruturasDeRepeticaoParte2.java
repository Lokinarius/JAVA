package curso.guanabara.introducao;
import java.util.Scanner;
public class Main009EstruturasDeRepeticaoParte2 {
    // ESTRUTURA DE REPETIÇÃO COM TESTE LÓGICO NO FINAL
    public static void main(String[] args) {

        // ESTRUTURA DE REPETIÇÃO DO-WHILE
        int k = 0;
        System.out.println("do {K++;} while(k < 10);");
        do {
            System.out.println("NÚMERO " + (k + 1));
            k++;
        } while (k < 10);
        System.out.println("\n");

        // Outro exemplo
        boolean para = false;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Quer continuar? (s/n) ");
            String resposta = scanner.next();
            para = resposta.equalsIgnoreCase("s");
        } while (para);

    }
}
