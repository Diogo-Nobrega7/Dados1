public class InsertionSort {
    public static void main(String[] args) {
        String[] alunos = {
            "Carlos", "Ana", "Bruna", "Eduardo", "Felipe", "Gustavo", "Helena", "Igor", "Juliana",
            "Lucas", "Mariana", "Nathalia", "Olga", "Pedro", "Diogo", "Renato", "Sofia", "Tiago", 
            "Vitor", "Yasmin"
        };
        InsertionSort(alunos);
    }
    public static void insertionSort(String[] nomes) {
        for (int i = 1; i < nomes.length; i++) {
            String chave = nomes[i];
            int j = i - 1;
            
            while (j >= 0 && nomes[j].compareTo(chave) > 0) {
                nomes[j + 1] = nomes[j];
                j--;
            }
            
            nomes[j + 1] = chave;
            
            System.out.print("Após a inserção " + i + ": ");
            for (String nome : nomes) {
                System.out.print(nome + " ");
            }
            System.out.println(); 
        }
    }
}
