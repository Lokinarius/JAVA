package curso.guanabara.poo.Aula008ExercicioPratico.domain;

public class Main008Livro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Miki",23,"F");
        p[1] = new Pessoa("Tatsuro",30,"M");

        l[0] = new Livro("Guia do japão","Hirohito",264,102,true,p[1]);
        l[1] = new Livro("Roupas de Verão","Eiko",67,32,false,p[0]);
        l[2] = new Livro("Teoria Musical","Hideki",450,93,false,p[1]);

        System.out.println(l[0].detalhes());
        //System.out.println();
        //System.out.println();
    }
}
