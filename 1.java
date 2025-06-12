public class AlgoritmosDeOrdenacao {

    public static void main(String[] args) {
        int[] vetor = {5, 2, 9, 1, 5, 6};

        System.out.println("Vetor original:");
        imprimir(vetor);

        int[] vetorSelection = vetor.clone();
        selectionSort(vetorSelection);
        System.out.println("\nApós Selection Sort:");
        imprimir(vetorSelection);

        int[] vetorInsertion = vetor.clone();
        insertionSort(vetorInsertion);
        System.out.println("\nApós Insertion Sort:");
        imprimir(vetorInsertion);

        int[] vetorBubble = vetor.clone();
        bubbleSort(vetorBubble);
        System.out.println("\nApós Bubble Sort:");
        imprimir(vetorBubble);
    }

    public static void imprimir(int[] vetor) {
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = vetor[minIndex];
            vetor[minIndex] = vetor[i];
            vetor[i] = temp;
        }
    }

    public static void insertionSort(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            int chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }
    }

    public static void bubbleSort(int[] vetor) {
        boolean trocou;
        do {
            trocou = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    trocou = true;
                }
            }
        } while (trocou);
    }
}