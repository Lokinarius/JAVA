package curso.guanabara.poo.Aula006Relacionamento;

public class Main006 {
    public static void main(String[] args) {
        // PythonBoy
        Lutador PythonBoy = new Lutador("PythonBoy","França",31,1.75f,68.9f,11,2,1);
        PythonBoy.apresentar();
        PythonBoy.status();

        // CopyScript
        Lutador CopyScript = new Lutador("CopyScript","Brasil",29,1.68f,57.8f,14,2,3);
        CopyScript.apresentar();
        CopyScript.status();

        // SnapShadow
        Lutador SnapShadow = new Lutador("SnapShadow","EUA",35,1.65f,80.9f,12,2,1);
        SnapShadow.apresentar();
        SnapShadow.status();

        // DeadCode
        Lutador DeadCode = new Lutador("DeadCode","Austrália",28,1.93f,81.6f,13,0,2);
        DeadCode.apresentar();
        DeadCode.status();

        // UfoCobol
        Lutador UfoCobol = new Lutador("UfoCobol","Japão",37,1.70f,119.3f,5,4,3);
        UfoCobol.apresentar();
        UfoCobol.status();

        //HolyAssembly
        Lutador HolyAssembly = new Lutador("HolyAssembly","Italia",33,1.8f,105.7f,12,1,0);
        HolyAssembly.apresentar();
        HolyAssembly.status();
    }
}
