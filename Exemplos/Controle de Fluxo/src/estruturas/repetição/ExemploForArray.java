package estruturas.repetição;
public class ExemploForArray {
    public static void main(String[] args) {
        // Criação do Array alunos. Índice inicia em 0
        String alunos [] = { "FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (int x = 0; x<alunos.length; x++) {

            // Busca o índice do Array e exibe o nome do aluno no índice
            System.out.println("O aluno no índice " + x + " é " + alunos[x]);

        // Realiza a mesma função do for acima, mas de forma simplificada.
        for (String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }
        
        }
    }
}
