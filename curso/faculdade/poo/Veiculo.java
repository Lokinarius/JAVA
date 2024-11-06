package curso.faculdade.poo;

public class Veiculo {
    // [ATRIBUTOS]
    private String placa;
    private int ano;

    // [CONSTRUTOR]
    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    //[METODOS]
    public abstract double calcularValorSeguro();

    public void exibirDetalhes() {
        System.out.println("Placa: " + placa);
        System.out.println("Ano: " + ano);
    }

    // [GETTERS E SETTERS]
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
}
