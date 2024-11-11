package curso.faculdade.poo;

//[IMPORT]
import java.util.ArrayList;

public class MainGerenciadorVeiculos {
    public static void main(String[] args) {
        //[FROTA DE VEÍCULOS]
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro("SAD3456",1999,4));
        veiculos.add(new Carro("DOW0984",2008,2));
        veiculos.add(new Carro("ABC1234",2010,5));
        veiculos.add(new Moto("KNT0927",2021,200));
        veiculos.add(new Moto("ABC5678",2020,150));
        veiculos.add(new Moto("KIL2734",2005,290));

        //[SAÍDA DE DADOS]
        for (Veiculo veiculo : veiculos){
            veiculo.exibirDetalhes();
            double valorSeguro = veiculo.calcularValorSeguro();
            System.out.println("Valor do Seguro: " + valorSeguro);
            Manutencao manutencao = (Manutencao) veiculo;
            System.out.println(manutencao.realizarManutencao());
        }
        System.out.println("--------------------------");
    }
}
