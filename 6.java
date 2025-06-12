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

public class Loja {
    public static void main(String[] args) {
        Produto[] produtos = {
            new Produto("Camiseta", 29.90),
            new Produto("Calça Jeans", 89.90),
            new Produto("Tênis Esportivo", 199.90),
            new Produto("Boné", 19.90)
        };

        ordenar(produtos, "nome");
        System.out.println("Ordenado por nome:");
        imprimir(produtos);

        ordenar(produtos, "preco");
        System.out.println("\nOrdenado por preço:");
        imprimir(produtos);
    }

    public static void ordenar(Produto[] produtos, String criterio) {
        for (int i = 1; i < produtos.length; i++) {
            Produto chave = produtos[i];
            int j = i - 1;
            while (j >= 0 && (criterio.equals("nome") ? produtos[j].nome.compareTo(chave.nome) > 0 : produtos[j].preco > chave.preco)) {
                produtos[j + 1] = produtos[j];
                j--;
            }
            produtos[j + 1] = chave;
        }
    }

    public static void imprimir(Produto[] produtos) {
        for (Produto p : produtos) {
            System.out.println(p);
        }
    }
}