class Aluno {
    String nome;
    double nota;

    Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nome + " - " + nota;
    }
}

public class OrdenacaoNotas {
    public static void main(String[] args) {
        Aluno[] alunos = {
            new Aluno("João", 7.5),
            new Aluno("Maria", 8.9),
            new Aluno("Pedro", 5.3),
            new Aluno("Ana", 9.1),
            new Aluno("Lucas", 6.7)
        };

        System.out.println("Antes da ordenação:");
        imprimir(alunos);

        insertionSort(alunos);

        System.out.println("\nDepois da ordenação:");
        imprimir(alunos);
    }

    public static void insertionSort(Aluno[] alunos) {
        for (int i = 1; i < alunos.length; i++) {
            Aluno chave = alunos[i];
            int j = i - 1;
            while (j >= 0 && alunos[j].nota > chave.nota) {
                alunos[j + 1] = alunos[j];
                j--;
            }
            alunos[j + 1] = chave;
        }
    }

    public static void imprimir(Aluno[] alunos) {
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}