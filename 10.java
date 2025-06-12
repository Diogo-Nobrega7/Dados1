public class Tabela {
    public static void main(String[] args) {
        System.out.printf("%-30s %-25s %-25s %-25s\n", "Critério", "Insertion Sort", "Bubble Sort", "Selection Sort");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.printf("%-30s %-25s %-25s %-25s\n", "Estabilidade", "Estável", "Estável", "Não estável");
        System.out.printf("%-30s %-25s %-25s %-25s\n", "Complexidade - Melhor Caso", "O(n)", "O(n)", "O(n²)");
        System.out.printf("%-30s %-25s %-25s %-25s\n", "Complexidade - Médio Caso", "O(n²)", "O(n²)", "O(n²)");
        System.out.printf("%-30s %-25s %-25s %-25s\n", "Complexidade - Pior Caso", "O(n²)", "O(n²)", "O(n²)");
        System.out.printf("%-30s %-25s %-25s %-25s\n", "Uso Recomendado", "Pequenos dados ou quase ordenados", 
                "Pequenos dados ou casos simples", "Pequenos dados");
        System.out.printf("%-30s %-25s %-25s %-25s\n", "Eficiência Prática", "Alta em dados pequenos", "Baixa", "Baixa");
    }
}