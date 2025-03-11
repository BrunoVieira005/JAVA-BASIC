package estruturas.excepcionais;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in).useLocale(Locale.US);

        // Try catch para captura de exceções
        try {
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        // Imprime os dados obtidos

        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é de " + altura + "cm");
        scanner.close();

        } // Caso haja uma exceção causada por conflito no input, catch captura-a e exibe a mensagem abaixo ao usuário
        catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser numéricos");
        }
    }
}
