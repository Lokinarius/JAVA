package curso.guanabara.introducao.Prova;

public class v {
    public static void main(String[] args) {
        int v0 = 3;
        int v1 = v0++;
        int v2 = ++v1;
        v1 += v0;
        v2 += --v1;

        int[] valores = {v0, v1, v2};
        String[] nomes = {"v0", "v1", "v2"};
        for (int i = 0; i < valores.length; i++) {
            System.out.print(nomes[i] + ": " + valores[i] + " ");
            System.out.println("\n");
        }
    }
}
