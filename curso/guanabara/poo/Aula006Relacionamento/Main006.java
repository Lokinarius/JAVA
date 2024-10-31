package curso.guanabara.poo.Aula006Relacionamento;

import java.util.ArrayList;

public class Main006 {
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

        // Iterar pela lista e exibir informações dos lutadores
        for (Lutador lutador : lutadores) {
            lutador.apresentar();
            lutador.status();
            System.out.println("-------------");        // PythonBoy
        }
    }
}
