package apps;

// Classe abstrata que representa o serviço de mensagem instantânea

public abstract class ServicoMensagemInstantanea {
    // Em java, métodos ABSTRATOS não possuem corpo.
    // Todos métodos ABSTRATOS são obrigatórios de serem implementados 
    // nas classes que estenderem esta classe abstrata

    // Método abstrato para enviar mensagens
    public abstract void enviarMensagem(); 

    // Método abstrato para receber mensagens
    public abstract void receberMensagem(); 

    // Método protegido "protected", que somente classes filhas ou de mesmo pacote têm acesso
    protected void validarConectadoInternet() {
        System.out.println( "Validando se está conectado a internet...");
    }
}
