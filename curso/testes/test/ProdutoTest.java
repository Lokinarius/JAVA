package curso.testes.test;

import curso.testes.domain.GerenciadorProduto;
import java.util.Scanner;

public class ProdutoTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorProduto gerenciador = new GerenciadorProduto();
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nMENU:");
            System.out.println("[1] Cadastrar Produto");
            System.out.println("[2] Listar Produtos");
            System.out.println("[3] Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    gerenciador.cadastro(scanner);
                    break;
                case 2:
                    gerenciador.listagem(scanner);
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
