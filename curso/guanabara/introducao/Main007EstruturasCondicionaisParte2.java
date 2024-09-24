package curso.guanabara.introducao;
import java.util.Scanner;
public class Main007EstruturasCondicionaisParte2 {
    public static void main(String[] args) {
        // ESTRUTURAS CONDICIONAIS - PARTE 2
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o ano de nascimento");
        int nasc = teclado.nextInt();
        int idade = 2023 - nasc;
        if(idade < 16){
            System.out.println("Não vota");
        } else {
            if(idade >= 18 && idade <= 65){
                System.out.println("Voto Obrigatório");
            } else {
                System.out.println("Voto Facultativo");
            }
        }
        // CONDIÇÃO MÚLTIPLA ESCOLHA
        String genero;
        System.out.println("Digite o seu gênero (M/F)");
        genero = teclado.next();
        switch(genero){
            case "M":
                System.out.println("Masculino");
                break;
            case "F":
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Gênero inválido");
        }
        // fechando scanner
        teclado.close();
    }
}
