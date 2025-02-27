package curso.guanabara.poo.Aula012ExercioPratico.test;

import curso.guanabara.poo.Aula012ExercioPratico.domain.Gafanhoto;
import curso.guanabara.poo.Aula012ExercioPratico.domain.Video;
import curso.guanabara.poo.Aula012ExercioPratico.domain.Visualizacao;

public class Main012 {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula de Sonegação");
        v[1] = new Video("Aula de Armamento nuclear");
        v[2] = new Video("Aula de Espalhar mentiras na net");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Doomer",29,"M","Palhaço Triste");
        g[1] = new Gafanhoto("Egrilo",22,"F","Muie na Net");

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(g[0], v[1]);
        vis[0].avaliar(35);


        System.out.println(vis[0]);

        System.out.println("\nVIDEOS\n---------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\nGAFANHOTOS\n-----------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());

    }
}
