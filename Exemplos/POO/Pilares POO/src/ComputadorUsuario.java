// Importa as classes do pacote "apps"
import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class ComputadorUsuario {
    public static void main(String[] args) {
        // Declara a variável de tipo ServicoMensagemInstantanea "smi", inicializada sem instância atribuída 
        ServicoMensagemInstantanea smi = null;
        /*
         * -
         * NÃO SE SABE QUAL APP
         * MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
         * -
         */
        String appEscolhido = "msn";

        if (appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if (appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if (appEscolhido.equals("tlg"))
            smi = new Telegram();
            
        // De acordo ao valor declarado em "appEscolhido", chama os métodos sobrescritos da classe instanciada
        smi.enviarMensagem();
        smi.receberMensagem();

    }
}