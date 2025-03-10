import java.util.Random;
public class ExemploDoWhile {
    public static void main(String[] args) {
        // Exibe "Discando..."
        System.out.println("Discando...");

        // Faça
        do {
            // Executando repetidas vezes, até que alguém atenda
            System.out.println("Telefone tocando");

        // Enquanto a função "tocando" for verdadeira
        } while (tocando());

        // Após a variável booleana "atendeu" passar a ser true, ou seja 
        // Quando seu valor for 1, atendeu = true
        // Exibirá a mensagem "Alô !!!"
        System.out.println("Alô !!!");
    }

    private static boolean tocando() {
        // Variável booleana "atendeu", com valor randomizado de 1 a 3
        boolean atendeu = new Random().nextInt(3) == 1;

        // Exibe "Atendeu? + estado da variável (true / false)"
        System.out.println("Atendeu? " + atendeu);

        // Nega o ato de continuar tocando
        return ! atendeu;
    }
}
