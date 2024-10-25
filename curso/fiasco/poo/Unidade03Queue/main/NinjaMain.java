package curso.fiasco.poo.Unidade03Queue.main;

// Imports
import java.util.*;

public class NinjaMain {
    public static void main(String[] args) {
        // Array
        String[] ninjasArray = new String[6];

        // Listas
        List<String> ninjas = new ArrayList<String>();

        // Stack
        Stack<String> ninjasStack = new Stack<String>();

        // Queues
        Queue<String> ninjasQueue = new LinkedList<String>();
        ninjasQueue.add("Chouji"); // head
        ninjasQueue.add("Neji");
        ninjasQueue.add("Kiba");
        ninjasQueue.add("Shikamaru");
        ninjasQueue.add("Naruto"); // tail

        // Mostrar fila
        System.out.println("Mostrar fila" + ninjasQueue);

        // Tirar um ninja da fila
        ninjasQueue.poll();
        System.out.println("Ninjas que avançaram para resgatar o Sasuke: " + ninjasQueue);

        // Ver quem é o novo head
        ninjasQueue.peek();
        System.out.println("Proximo ninja a lutar: " + ninjasQueue);

        // Adicionar a fila
        ninjasQueue.add("Rock Lee");

        // Não é possivel deletar o tail

        // Esvaziar fila
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();

        // verificar se a fila está vazia
        if(ninjasQueue.isEmpty()){
            System.out.println("Todos os ninjas estão lutando");
        }
    }
}
