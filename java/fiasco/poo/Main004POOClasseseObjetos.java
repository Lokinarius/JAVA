package java.fiasco.poo;

public class Main004POOClasseseObjetos {
    public static void main(String[] args) {
        // objeto 1
        uzumaki naruto = new uzumaki();
        naruto.setNome("Naruto java.fiasco.poo.Uzumaki");
        naruto.getNome();
        naruto.idade = 16;
        naruto.bijuu = true;
        naruto.ataqueBase();


        // objeto 2
        uchiha sasuke = new uchiha();
        sasuke.setNome("Sasuke java.fiasco.poo.Uchiha");
        sasuke.getNome();
        sasuke.sharingan();
        sasuke.ataqueBase(12);
    }
}
