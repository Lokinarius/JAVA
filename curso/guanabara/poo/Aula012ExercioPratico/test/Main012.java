package curso.guanabara.poo.Aula012ExercioPratico.test;

import curso.guanabara.poo.Aula012ExercioPratico.domain.Gafanhoto;
import curso.guanabara.poo.Aula012ExercioPratico.domain.Video;

public class Main012 {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de Java");
        v[2] = new Video("Aula 5 de IA");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Doomer",29,"M","Palhaço Triste");
        g[1] = new Gafanhoto("Egrilo",22,"F","Muie na Net");

        System.out.println(v[0].toString());
    }
}
