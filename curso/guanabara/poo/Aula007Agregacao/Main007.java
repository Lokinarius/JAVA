package curso.guanabara.poo.Aula007Agregacao;
import curso.guanabara.poo.Aula007Agregacao.Lutador;
import curso.guanabara.poo.Aula007Agregacao.Luta;
import java.util.ArrayList;
public class Main007 {
    public static void main(String[] args) {
        // Lista de lutadores
        ArrayList<Lutador> lutadores = new ArrayList<>();

        // Adicionar lutadores à lista
        lutadores.add(new Lutador("PythonBoy", "França", 31, 1.75f, 68.9f, 11, 2, 1));
        lutadores.add(new Lutador("CopyScript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3));
        lutadores.add(new Lutador("SnapShadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1));
        lutadores.add(new Lutador("DeadCode", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2));
        lutadores.add(new Lutador("UfoCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3));
        lutadores.add(new Lutador("HolyAssembly", "Italia", 33, 1.8f, 105.7f, 12, 1, 0));

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(lutadores.get(0), lutadores.get(1)); // PythonBoy vs CopyScript
        UEC01.lutar();
        lutadores.get(0).status();
        lutadores.get(1).status();

    }
}
