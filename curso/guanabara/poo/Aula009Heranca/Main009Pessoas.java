package curso.guanabara.poo.Aula009Heranca;

public class Main009Pessoas {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Ichigo",17,"M");
        Aluno p2 = new Aluno("Naruto",15,"M",1234,"Ninja");
        Professor p3 = new Professor("Jiraya",54,"M","Sennin",5000);
        Funcionario p4 = new Funcionario("Luffy",19,"M","Navegação",true);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
