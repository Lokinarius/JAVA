package curso.guanabara.poo.Aula004Exercicio;

public class Main004 {
    public static void main(String[] args) {
        // [CONTAS]
        // Criando uma conta
        ContaBanco cb1 = new ContaBanco();
        cb1.setNumConta(123456);
        cb1.setDono("Harumi Suzuki");
        cb1.abrirConta("Conta Corrente");
        cb1.setSaldo(1000.0f);
        cb1.setStatus(true);
        // Criando uma segunda conta
        ContaBanco cb2 = new ContaBanco();
        cb2.setNumConta(789012);
        cb2.setDono("Makoto Hisashi");
        cb2.abrirConta("Conta Poupança");

        //[
        // Depósito
        cb1.depositar(300);
        cb2.depositar(500);
        // Saque
        cb1.sacar(200);
        cb2.sacar(800);
        // Pagamento de Mensalidade
        cb1.pagarMensalidade();
        cb2.pagarMensalidade();

        // Estado da Conta
        cb1.estadoAtual();
        cb2.estadoAtual();




    }
}
