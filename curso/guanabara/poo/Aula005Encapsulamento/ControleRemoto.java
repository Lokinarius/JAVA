package curso.guanabara.poo.Aula005Encapsulamento;

public class ControleRemoto implements Controlador{
    // [ATRIBUTOS]
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // [MÉTODOS]
    // Construtor
    public ControleRemoto(int volume, boolean ligado, boolean tocando) {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    // Getters e Setters
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public boolean isLigado() {
        return ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    public boolean isTocando() {
        return tocando;
    }
    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    // Métodos Abstratos
    @Override
    public void ligar() {

    }
    @Override
    public void desligar() {

    }
    @Override
    public void abrirMenu() {
    }
    @Override
    public void fecharMenu() {
    }
    @Override
    public void maisVolume() {

    }
    @Override
    public void menosVolume() {

    }
    @Override
    public void ligarMudo() {

    }
    @Override
    public void desligarMudo() {

    }
    @Override
    public void play() {

    }
    @Override
    public void pause() {

    }

}
