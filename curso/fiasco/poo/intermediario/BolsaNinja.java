package curso.fiasco.poo.intermediario;

import java.util.List;
import java.util.ArrayList;
public class BolsaNinja<T> {
    // Inicializar Array

    private List<T> ferramentas;

    // Construtor
    public BolsaNinja() {
        this.ferramentas = new ArrayList<>();
    }

    // Colocar ferramentas no array
    public void adcionarFerramenta(T ferramenta){
        ferramentas.add(ferramenta);
    }

    // Mostrar lista de ferramentas
    public void mostrarFerramentas(){
        for(T ferramenta : ferramentas){
            System.out.println(ferramenta);
        }
    }
}
