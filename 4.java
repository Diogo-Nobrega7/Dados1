import java.util.Arrays;
import java.util.Random;

public class CompararBuscas {

    public static void main(String[] args) {
        int[] vetor = new int[1000];
        Random random = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(10000);
        }
        Arrays.sort(vetor);

        int inicio = vetor[0];
        int meio = vetor[vetor.length / 2];
        int inexistente = -1;

        System.out.println("Busca Sequencial:");
        testarBusca("Início", inicio, vetor);
        testarBusca("Meio", meio, vetor);
        testarBusca("Inexistente", inexistente, vetor);

        System.out.println("\nBusca Binária:");
        testarBuscaBinaria("Início", inicio, vetor);
        testarBuscaBinaria("Meio", meio, vetor);
        testarBuscaBinaria("Inexistente", inexistente, vetor);
    }

    public static void testarBusca(String descricao, int alvo, int[] vetor) {
        long inicio = System.nanoTime();
        boolean encontrado = buscaSequencial(vetor, alvo);
        long fim = System.nanoTime();
        System.out.printf("Busca %s: %s | Tempo: %d ns\n", descricao, encontrado ? "Encontrado" : "Não encontrado", fim - inicio);
    }

    public static void testarBuscaBinaria(String descricao, int alvo, int[] vetor) {
        long inicio = System.nanoTime();
        boolean encontrado = buscaBinaria(vetor, alvo);
        long fim = System.nanoTime();
        System.out.printf("Busca Binária %s: %s | Tempo: %d ns\n", descricao, encontrado ? "Encontrado" : "Não encontrado", fim - inicio);
    }

    public static boolean buscaSequencial(int[] vetor, int alvo) {
        for (int num : vetor) {
            if (num == alvo) {
                return true;
            }
        }
        return false;
    }

    public static boolean buscaBinaria(int[] vetor, int alvo) {
        int esquerda = 0;
        int direita = vetor.length - 1;
        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;
            if (vetor[meio] == alvo) {
                return true;
            }
            if (vetor[meio] < alvo) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }
        return false;
    }
}