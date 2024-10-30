package curso.guanabara.poo.Aula005Encapsulamento;

public class Main005 {
    public static void main(String[] args) {
        ControleRemoto cr = new ControleRemoto(50,true,false);
        cr.ligar();
        cr.desligar();
        cr.maisVolume();
        cr.menosVolume();
        cr.play();
        cr.pause();
        cr.abrirMenu();
        cr.fecharMenu();
        cr.ligarMudo();
        cr.desligarMudo();
    }
}
