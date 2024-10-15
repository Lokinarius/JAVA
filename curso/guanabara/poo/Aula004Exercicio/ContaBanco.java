package curso.guanabara.poo.Aula004Exercicio;
// + abrirConta()
// + fecharConta()
// + depositar()
// + sacar()
// + pagarMensal()
// getnumConta()
// setnumConta()
// getTipo()
// setTipo()
// getDono()
// setDono()
// getSaldo()
// setSaldo()
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    // CONSTRUTOR


    // GETTERS & SETTERS
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // STATUS
    public static void main(String[] args) {
        System.out.println("Número da Conta: " + this.numConta);
        System.out.println("Tipo da Conta: " + this.tipo);
        System.out.println("Dono da Conta: " + this.dono);
        System.out.println("Saldo da Conta: " + this.saldo);
        System.out.println("Status da Conta: " + this.status);

    }

    // [METODOS ESPECIAS]
    public void abrirConta(int numConta, String tipo, String dono, float saldo) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = true;
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if (this.saldo == 0 && this.status == true) {
            this.status = false;
            System.out.println("Conta fechada com sucesso!");
        } else {
            System.out.println("Impossível fechar a conta. Saldo insuficiente ou conta não está aberta.");
        }
    }

    public void depositar(float valor) {
        if (this.status == true) {
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso! Novo saldo: " + this.saldo);
        } else {
            System.out.println("Impossível depositar. Conta fechada.");
        }
    }

    public void sacar(float valor) {
        if (this.status == true && this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso! Novo saldo: " + this.saldo);
        } else {
            System.out.println("Impossível sacar. Saldo insuficiente ou conta não está aberta.");
        }
    }


    public void pagarMensal() {

    }
}
