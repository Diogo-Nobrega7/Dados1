class Produto {
    String nome;
    double preco;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String toString() {
        return nome + " - R$" + preco;
    }
}

public class Sistema {
    public static void main(String[] args) {
        Produto[] produtos = {
            new Produto("Camiseta", 29.90),
            new Produto("Calça Jeans", 89.90),
            new Produto("Tênis Esportivo", 199.90),
            new Produto("Boné", 19.90)
        };

        System.out.println("Antes da ordenação:");
        imprimir(produtos);

        // Ordenação usando Bubble Sort
        bubbleSort(produtos);

        System.out.println("\nDepois da ordenação:");
        imprimir(produtos);
    }

    public static void bubbleSort(Produto[] produtos) {
        int n = produtos.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (produtos[j].preco > produtos[j + 1].preco) {
                    Produto temp = produtos[j];
                    produtos[j] = produtos[j + 1];
                    produtos[j + 1] = temp;
                }
            }
        }
    }

    public static void imprimir(Produto[] produtos) {
        for (Produto p : produtos) {
            System.out.println(p);
        }
    }
}