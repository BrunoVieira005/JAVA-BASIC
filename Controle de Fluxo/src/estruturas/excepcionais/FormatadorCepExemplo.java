package estruturas.excepcionais;

public class FormatadorCepExemplo {
    public static void main(String[] args) {

        // TryCatch para tratamento de exceção
        try {

            // String cepFormatado recebe o método formatarCep que tem como parâmetro o cep
            String cepFormatado = formatarCep("23.456-789");

            // Estando tudo correto, o sistema exibe o cep novamente, após uso do método formatarCep
            System.out.println(cepFormatado);

        // Caso seja entrado o dado em formato incorreto, a aplicação cai na exceção criada, exibindo uma mensagem    
        } catch (CepInvalidoException e) {
            System.out.println("O CEP não corresponde com as regras de negócio.");
        }        
    }
    // Método formatarCep, pede como parâmetro a String cep
    static String formatarCep(String cep) throws CepInvalidoException {
        // Se o valor diferir de 8
        if (cep.length() != 8)
        // Cria uma nova instância da exceção CepInvalidoException
            throw new CepInvalidoException();

            // Esse return contém apenas a simulação do CEP formatado, de acordo com o valor utilizado  
            return "23.456-789";
    }
}
