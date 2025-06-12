public class OrdenacaoSimples {

    public static void main(String[] args) {
        int[] ordenado = {1, 2, 3, 4, 5};
        System.out.println("Vetor já ordenado:");
        compararAlgoritmos(ordenado);

        int[] inverso = {5, 4, 3, 2, 1};
        System.out.println("\nVetor em ordem inversa:");
        compararAlgoritmos(inverso);

        int[] aleatorio = {3, 1, 4, 5, 2};
        System.out.println("\nVetor com valores aleatórios:");
        compararAlgoritmos(aleatorio);
    }

    public static void compararAlgoritmos(int[] v) {
        System.out.println("Selection Sort:");
        executarAlgoritmo(v.clone(), "selection");

        System.out.println("Insertion Sort:");
        executarAlgoritmo(v.clone(), "insertion");

        System.out.println("Bubble Sort:");
        executarAlgoritmo(v.clone(), "bubble");
    }

    public static void executarAlgoritmo(int[] v, String tipo) {
        int comparacoes = 0;
        int trocas = 0;

        switch (tipo) {
            case "selection":
                for (int i = 0; i < v.length - 1; i++) {
                    int minIndex = i;
                    for (int j = i + 1; j < v.length; j++) {
                        comparacoes++;
                        if (v[j] < v[minIndex]) {
                            minIndex = j;
                        }
                    }
                    if (minIndex != i) {
                        int temp = v[i];
                        v[i] = v[minIndex];
                        v[minIndex] = temp;
                        trocas++;
                    }
                }
                break;

            case "insertion":
                for (int i = 1; i < v.length; i++) {
                    int chave = v[i];
                    int j = i - 1;
                    while (j >= 0 && v[j] > chave) {
                        comparacoes++;
                        v[j + 1] = v[j];
                        j--;
                        trocas++;
                    }
                    v[j + 1] = chave;
                    if (j != i - 1) {
                        trocas++;
                    }
                }
                break;

            case "bubble":
                boolean trocou;
                do {
                    trocou = false;
                    for (int i = 0; i < v.length - 1; i++) {
                        comparacoes++;
                        if (v[i] > v[i + 1]) {
                            int temp = v[i];
                            v[i] = v[i + 1];
                            v[i + 1] = temp;
                            trocas++;
                            trocou = true;
                        }
                    }
                } while (trocou);
                break;
        }

        System.out.println("Comparações: " + comparacoes + ", Trocas: " + trocas);
    }
}