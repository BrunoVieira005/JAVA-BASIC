import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        /* ToDo
            Conhecer e importar a classe Scanner
            Exibir as mensagens ao usuário
            Obter pela classe Scanner os valores digitados no terminal
            Exibir a mensagem: "Conta Criada"
        */

        // Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Olá! Para iniciar seu cadastro, digite o seu nome completo: ");
            String nomeCompleto = scanner.nextLine();
    
            System.out.println("Por favor, digite o número da conta: ");
            int numero = scanner.nextInt();

            System.out.println("Agora, digite o número da agência: ");
            String agencia = scanner.next();

            System.out.println("Por último, seu saldo bancário: ");
            double saldo = scanner.nextDouble();

            // Imprimindo o texto de boas vindas, concatenando com os dados recebidos pelo usuário
            System.out.println(
                "Olá, " + nomeCompleto + ", obrigado por criar uma conta em nosso banco! \nSua agência é " + agencia + 
                ", conta Nº" + numero + " e seu saldo de R$" + saldo + " já está disponível para saque."
            );
        
    }
}

