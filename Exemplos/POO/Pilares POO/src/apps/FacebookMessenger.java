package apps;

// Herda a classe ServicoMensagemInstantanea
public class FacebookMessenger extends ServicoMensagemInstantanea {

    // @Override Sobrescreve o método abstrato enviarMensagem para fornecer uma implementação específica
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook Messenger");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook Messenger");
    }
}