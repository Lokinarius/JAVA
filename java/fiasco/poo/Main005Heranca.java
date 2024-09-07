package java.fiasco.poo;

public class Main005Heranca {
    public static void main(String[] args) {
        // objeto 1
        uzumaki Naruto = new uzumaki();
        Naruto.nome = "Naruto java.fiasco.poo.Uzumaki";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 17;
        Naruto.ChakraInfinito(); // metodo específico da subclasse

        // objeto 2
        uchiha Sasuke = new uchiha();
        Sasuke.nome = "Sasuke java.fiasco.poo.Uchiha";
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.idade = 18;
        Sasuke.SharinganAtivado(); // metodo específico da subclasse

        // objeto 3
        haruno Sakura = new haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.idade = 18;
        Sakura.SuperForca(); // metodo específico da subclasse

        //objeto 4
        hyuuga Hinata = new hyuuga();
        Hinata.nome = "Hinata Hyuuga";
        Hinata.aldeia = "Aldeia da Folha";

        Hinata.idade = 16;
        Hinata.Byakugan(); // metodo específico da subclasse
    }
}
