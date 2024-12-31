package curso.guanabara.poo.Aula011PolimorfismoParte2;

public class Cachorro extends Lobo{
    //[SOBREPOSIÇÃO]
    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("Latido");
    }

    //[METODOS]
    public void reagir(String frase){
        if(frase == "Toma Comida" || frase == "Olá"){
            System.out.println("Abanar e Latir");
        }else{
            System.out.println("Rosnar");
        }
    }

    public void reagir(int hora, int min){
        if(hora<12){
            System.out.println("Abanar");
        } else if (hora>18) {
            System.out.println("Ignorar");
        }else{
            System.out.println("Abanar e Latir");
        }
    }

    public void reagir(boolean dono){
        if(dono == true){
            System.out.println("Abanar o rabo");
        }else {
            System.out.println("Rosnar e Latir");
        }
    }

}
