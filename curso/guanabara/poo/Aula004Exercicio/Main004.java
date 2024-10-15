package curso.guanabara.poo.Aula004Exercicio;

public class Main004 {
    public static void main(String[] args) {
        ContaBanco cb1 = new ContaBanco();
        cb1.setNumConta(123456);
        cb1.setTipo("Conta Corrente");
        cb1.setDono("João");
        cb1.setSaldo(1000.0f);
        cb1.setStatus(true);

        System.out.println("Conta #" + cb1.getNumConta());
        System.out.println("Tipo: " + cb1.getTipo());
        System.out.println("Dono: " + cb1.getDono());
        System.out.println("Saldo: " + cb1.getSaldo());
        System.out.println("Status: " + cb1.isStatus());

    }
}
