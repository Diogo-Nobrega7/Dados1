import java.util.Arrays;
import java.util.Random;

public class CompararOrdenacoes {

    public static void main(String[] args) {
        int[] vetor = gerarVetorAleatorio(1000);

        System.out.println("Vetor original:");
        imprimirVetor(vetor);

        qualMelhorOrdenacao(vetor);
    }

    public static void qualMelhorOrdenacao(int[] v) {
        int[] vetor = Arrays.copyOf(v, v.length);

        System.out.println("\n--- Selection Sort ---");
        medirDesempenho(vetor, "Selection Sort");

        vetor = Arrays.copyOf(v, v.length);
        System.out.println("\n--- Insertion Sort ---");
        medirDesempenho(vetor, "Insertion Sort");

        vetor = Arrays.copyOf(v, v.length);
        System.out.println("\n--- Bubble Sort ---");
        medirDesempenho(vetor, "Bubble Sort");
    }

    public static void medirDesempenho(int[] vetor, String nomeAlgoritmo) {
        long inicio = System.nanoTime();
        int comparacoes = 0;
        int trocas = 0;

        if (nomeAlgoritmo.equals("Selection Sort")) {
            comparacoes = selectionSort(vetor);
        } else if (nomeAlgoritmo.equals("Insertion Sort")) {
            comparacoes = insertionSort(vetor);
        } else if (nomeAlgoritmo.equals("Bubble Sort")) {
            comparacoes = bubbleSort(vetor);
        }

        long fim = System.nanoTime();
        long tempo = fim - inicio;
        System.out.println(nomeAlgoritmo + " - Tempo: " + tempo + " ns | Comparações: " + comparacoes + " | Trocas: " + trocas);
    }

    public static int selectionSort(int[] vetor) {
        int comparacoes = 0;
        for (int i = 0; i < vetor.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < vetor.length; j++) {
                comparacoes++;
                if (vetor[j] < vetor[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = vetor[minIndex];
            vetor[minIndex] = vetor[i];
            vetor[i] = temp;
        }
        return comparacoes;
    }

    public static int insertionSort(int[] vetor) {
        int comparacoes = 0;
        for (int i = 1; i < vetor.length; i++) {
            int chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > chave) {
                comparacoes++;
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }
        return comparacoes;
    }

    public static int bubbleSort(int[] vetor) {
        int comparacoes = 0;
        boolean trocou;
        do {
            trocou = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                comparacoes++;
                if (vetor[i] > vetor[i + 1]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    trocou = true;
                }
            }
        } while (trocou);
        return comparacoes;
    }

    public static int[] gerarVetorAleatorio(int tamanho) {
        int[] vetor = new int[tamanho];
        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(10000);
        }
        return vetor;
    }

    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}