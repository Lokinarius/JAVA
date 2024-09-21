package curso.guanabara.introducao;
import java.util.Scanner;
public class Main006EstruturasCondicionaisParte1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double n1 = leia.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double n2 = leia.nextDouble();
        double media = (n1 + n2) / 2;
        System.out.println("A média das duas notas é :" + media);

        // ESTRUTURA CONDICIONAL
        if (media >= 7.0) {
            System.out.println("Parabéns! Você foi aprovado!");
        } else {
            System.out.println("Você foi reprovado!");
        }

        leia.close();


    }
}
