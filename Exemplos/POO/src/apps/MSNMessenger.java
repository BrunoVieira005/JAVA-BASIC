package apps;

// Herda a classe ServicoMensagemInstantanea
public class MSNMessenger extends ServicoMensagemInstantanea{

    // @Override Sobrescreve o método abstrato enviarMensagem para fornecer uma implementação específica
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN Messenger");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN Messenger");
    }
}