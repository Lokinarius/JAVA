package curso.testes.domain;

public class Produto {
    // [ATRIBUTOS]
    private String name;
    private String description;
    private double value;
    private boolean available;

    // [METODOS]
    public boolean isAvailable() {
        return available;
    }


    // [CONSTRUTOR]
    public Produto(String name, String description, double value, boolean available) {
        this.name = name;
        this.description = description;
        this.value = value;
        this.available = available;
        if (this.available){
            System.out.println("Sim");
        } else{
            System.out.println("Não");
        }
    }

    // [TO STRING]
    @Override
    public String toString() {
        String disponibilidade;
        if (getAvailable()) {
            disponibilidade = "Sim";
        } else {
            disponibilidade = "Não";
        }
        return "Nome: " + getName() + "\n" +
                "Descrição: " + getDescription() + "\n" +
                "Preço: R$ " + getValue() + "\n" +
                "Disponível: " + disponibilidade + "\n" +
                "-----------------------------";
    }


    // [GETTERS E SETTERS]
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}

    public double getValue() {return value;}
    public void setValue(double value) {this.value = value;}

    public boolean getAvailable() {return available;}
    public void setAvailable(boolean available) {this.available = available;}
}
