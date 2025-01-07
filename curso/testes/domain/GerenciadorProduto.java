package curso.testes.domain;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorProduto {
    // [ATRIBUTOS]
    private List<Produto> produtos;

    // [ARRAY]
    public GerenciadorProduto(){
        this.produtos = new ArrayList<>();
    }

    //[METODOS]
    //Listagem
    public void listagem(Scanner scanner){
        System.out.println("\nLista de produtos");
        produtos.sort((p1,p2) -> Double.compare(p1.getValue(), p2.getValue()));
        for (Produto produto : produtos){
            System.out.println(produto);
        }
        System.out.println("\nDeseja cadastrar um novo produto?");
        System.out.println("[1] Sim");
        System.out.println("[2] Não");
        int opcao = scanner.nextInt();
        scanner.nextLine();
        if (opcao == 1) {
            cadastro(scanner);
        } else if (opcao != 2) {
            System.out.println("Opção inválida. Por favor, escolha 1 para Sim ou 2 para Não.");
        }

    }
    // Cadastro
    public void cadastro(Scanner scanner){
        System.out.print("\nDigite o nome do produto: ");
        String name = scanner.nextLine();

        System.out.print("Digite a descrição do produto: ");
        String description = scanner.nextLine();

        System.out.print("Digite o valor do produto: ");
        double value = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Está disponível para venda? (1 - Sim / 2 - Não): ");
        int resposta = scanner.nextInt();
        scanner.nextLine();
        while (resposta != 1 && resposta != 2) {
            System.out.println("Resposta inválida. Por favor, digite 1 para Sim ou 2 para Não.");
            resposta = scanner.nextInt();
            scanner.nextLine();
        }
        boolean available = (resposta == 1);

        Produto produto = new Produto(name, description, value, available);
        produtos.add(produto);
        System.out.println("\nProduto cadastrado");
    }
}
