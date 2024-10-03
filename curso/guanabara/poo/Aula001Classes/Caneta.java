package curso.guanabara.poo.Aula001Classes;

public class Caneta {
    public String modelo;
    public String cor;
    public float ponta;
    public int carga;
    public boolean tampada;

    void status(){
        System.out.println(" Modelo: " + this.modelo);
        System.out.println("Uma caneta "+ this.cor);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Carga: "+ this.carga);
        System.out.println("está tampada? "+ this.tampada);
    }

    protected void rabiscar(){
        if (this.tampada == true){
            System.out.println("Não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando");
        }

    }

    protected void tampar(){
        this.tampada = true;
    }

    protected void destampar(){
        this.tampada = false;
    }
}
