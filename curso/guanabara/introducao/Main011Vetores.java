package curso.guanabara.introducao;

public class Main011Vetores {
    public static void main(String[] args) {
        // Declarando um vetor de inteiros
        int[] numeros = {10, 20, 30, 40, 50};

        // Acessando elementos do vetor
        System.out.println("Primeiro elemento: " + numeros[0]);
        System.out.println("Último elemento: " + numeros[numeros.length - 1]);
        System.out.println("\n");

        // Percorrendo todos elementos do vetor
        for (int numero : numeros) {
            System.out.println(numero);
        }

        // Percorrendo todos elementos do vetor usando um loop for
        for(int i=0;i<numeros.length;i++){
            System.out.println("Na posição " + i + " temos o valor " + numeros[i]);
        }

        // Construindo um calendário
        String[] mes = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int[] tot = {31,28,31,30,31,30,31,31,30,31,30,31};
        for (int i = 0; i < mes.length; i++){
            System.out.println("O mês de " + mes[i] + " tem " + tot[i] + " dias.");
        }

        // Utilizando foreach
    }
}
