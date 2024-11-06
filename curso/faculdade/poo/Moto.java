package curso.faculdade.poo;

public class Moto extends Veiculo implements Manutencao{
    // [ATRIBUTOS]
    private int cilindrada;

    // [CONSTRUTOR]
    public Moto(String placa, int ano, int cilindrada) {
        super(placa, ano);
        this.cilindrada = cilindrada;
    }

    // [METODOS]
    @Override
    public double calcularValorSeguro() {
        return 300 + (cilindrada * 0.10);
    }

    @Override
    public String realizarManutencao() {
        return "Manutenção realizada na moto de " + getCilidrada() + " cilindradas, Modelo: " + getAno() + ", de " +
                "placa: " + getPlaca();
    }

    private int getCilidrada() {
        return cilindrada;
    }
}
