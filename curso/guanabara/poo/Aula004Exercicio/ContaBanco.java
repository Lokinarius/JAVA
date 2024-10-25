package curso.guanabara.poo.Aula004Exercicio;

import java.util.Objects;

public class ContaBanco {
    // [ATRIBUTOS]
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // [METODOS]
    // Abrir Conta
    public void abrirConta( String t) {
        this.setTipo(t);
        this.setStatus(true);
        if(Objects.equals(t, "Conta Corrente")){
            this.setSaldo(50);
        }else if(Objects.equals(t, "Conta Poupança")){
            this.setSaldo(150);
        }
    }
    // Fechar Conta
    public void fecharConta() {
        if(this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada, há saldo.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada, há débito.");
        } else {
            this.setStatus(false);
            System.out.println("Conta Fechada com sucesso!");
        }
    }
    // Depositar
    public void depositar(float valor) {
        if (this.isStatus()){
            this.saldo = this.saldo + valor;
            System.out.println("Deposito realizado na conta de " + getDono());
        } else {
            System.out.println("Não foi possível depositar. a conta está fechada.");
        }

    }
    // Sacar
    public void sacar(float valor) {
        if (this.isStatus()){
            if (this.getSaldo() >= valor){
                this.saldo = this.saldo - valor;
                System.out.println("Saque realizado na conta de " + getDono());
            } else {
                System.out.println("Saldo insuficiente para realizar o saque.");
            }
        } else {
            System.out.println("Não foi possível sacar. a conta está fechada.");
        }
    }
    // Pagamento
    public void pagarMensalidade() {
        int v = 0;
        if (this.getTipo() == "Conta Corrente"){
            v = 12;
        } else if (this.getTipo() == "Conta Poupança"){
            v = 20;
        }
        if (this.isStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else {
            System.out.println("Não foi possível pagar a mensalidade. a conta está fechada.");
        }
    }

    // [CONSTRUTOR]
    public void ContaBanco(){
        this.status = false;
        this.saldo = 0;

    }

    // [SETTERS E GETTERS]
    // Dono
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    // numConta
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    // Tipo
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    // Saldo
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    // Status
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
}
