/*
 Desafio de Projeto - Contador

O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros, com estes dois números você deverá obter a quantidade de interações (for) e realizar a impressão no console (System.out.print) dos números incrementados, exemplo:

Se você passar os números 12 e 30, logo teremos uma interação (for) com 18 ocorrências para imprimir os números, exemplo: "Imprimindo o número 1", "Imprimindo o número 2" e assim por diante.
Se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deverá lançar a exceção customizada chamada de ParametrosInvalidosException com a segunda mensagem: "O segundo parâmetro deve ser maior que o primeiro"
1. Crie o projeto DesafioControleFluxo
2. Dentro do projeto, crie a classe Contador.java para realizar toda a codificação do nosso programa.
3. Dentro do projeto, crie a classe ParametrosInvalidosException que representará a exceção de negócio no sistema.
 
*/

// Importa o Scanner para armazenar os dados de entrada nas variáveis declaradas onde for chamado
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        // Instancia o Scanner, com nome de "terminal"
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        // TryCatch para capturar exceções
        try {
            // Try verifica se o método contar caiu em exceção
            contar(parametroUm, parametroDois);

        // Catch, recebe a Exceção personalizada ParametrosInvalidosException
        } catch (ParametrosInvalidosException e) {
            // Caso cair em exceção, imprimirá a mensagem informando:
            // "O segundo parâmetro deve ser maior que o primeiro"
            System.out.println("O segundo parâmetro deve ser maior que o primeiro parâmetro.");
        }
    }

    // Método contar  
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Se o primeiro parâmetro for maior que o segundo
        if (parametroUm > parametroDois) {
            // Lança uma nova instancia da exceção ParametrosInvalidosException
            throw new ParametrosInvalidosException();
        }

        // Essa variável armazena o resto da subtração do parametroDois pelo parametroUm
        int contagem = parametroDois - parametroUm;

        // Loop for, onde a variável "i" inicializa com valor 1
        // Enquanto a variável "i" possuir valor menor ou igual à variável contagem
        // "i" será incrementado
        for (int i = 1; i <= contagem; i++) {
            // Imprime a mensagem em loop até a condição do for ser falsa
            System.out.println("Imprimindo o número: " + i);
    }
}
}
