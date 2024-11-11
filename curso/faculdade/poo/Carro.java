package curso.faculdade.poo;

public class Carro extends Veiculo implements Manutencao {
    // [ATRIBUTOS]
    private int numeroPortas;

    // [CONSTRUTOR]
    public Carro(String placa, int ano, int numeroPortas) {
        super(placa, ano);
        this.numeroPortas = numeroPortas;
    }

    // [METODOS]
    @Override
    public double calcularValorSeguro() {
        return 500 + (numeroPortas * 100);
    }

    @Override
    public String realizarManutencao() {
        return "Manutenção realizada no carro de " + getNumeroPortas() + " portas, Modelo: " + getAno() + ", de placa" +
                " : " + getPlaca();
    }

    // [GETTERS E SETTERS]
    public int getNumeroPortas() {
        return numeroPortas;
    }

}
