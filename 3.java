import java.util.Random;

public class AlgoritmosDeOrdenacao {

    public static void main(String[] args) {
        int[] tamanhos = {100, 1000, 10000};
        for (int tamanho : tamanhos) {
            System.out.println("\nVetor de tamanho " + tamanho + ":");
            int[] vetor = gerarVetorAleatorio(tamanho);
            medirTempo("Selection Sort", vetor.clone(), AlgoritmosDeOrdenacao::selectionSort);
            medirTempo("Insertion Sort", vetor.clone(), AlgoritmosDeOrdenacao::insertionSort);
            medirTempo("Bubble Sort", vetor.clone(), AlgoritmosDeOrdenacao::bubbleSort);
        }
    }

    public static void medirTempo(String nomeAlgoritmo, int[] vetor, Runnable algoritmo) {
        long inicio = System.nanoTime();
        algoritmo.run();
        long fim = System.nanoTime();
        long duracao = fim - inicio;
        System.out.println(nomeAlgoritmo + " levou " + duracao + " nanosegundos.");
    }

    public static int[] gerarVetorAleatorio(int tamanho) {
        Random random = new Random();
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(10000);
        }
        return vetor;
    }

    public static void selectionSort() {
    }

    public static void insertionSort() {
    }

    public static void bubbleSort() {
    }
}