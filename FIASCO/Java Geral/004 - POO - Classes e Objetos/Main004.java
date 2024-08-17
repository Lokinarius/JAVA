public class Main004 {
    public static void main(String[] args) {
        // objeto 1
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 16;
        naruto.bijuu = true;
        naruto.ataqueBase();


        // objeto 2
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.sharingan();
        sasuke.ataqueBase(12);
    }
}
