package curso.guanabara.poo.Aula010Polimorfismo;

public abstract class Animal {
    //[ATRIBUTOS]
    protected float peso;
    protected int idade;
    protected int membros;

    //[METODOS ABSTRATOS]
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    //[GETTERS E SETTERS]

}
