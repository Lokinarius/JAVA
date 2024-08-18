public class Main004 {
    public static void main(String[] args) {
        // objeto 1
        Uzumaki naruto = new Uzumaki();
        naruto.setNome("Naruto Uzumaki");
        naruto.getNome();
        naruto.idade = 16;
        naruto.bijuu = true;
        naruto.ataqueBase();


        // objeto 2
        Uchiha sasuke = new Uchiha();
        sasuke.setNome("Sasuke Uchiha");
        sasuke.getNome();
        sasuke.sharingan();
        sasuke.ataqueBase(12);
    }
}
