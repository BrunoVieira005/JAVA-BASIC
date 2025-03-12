/* Projeto: Criar um exemplo de uma classe para representar uma SmartTV, onde:

1. Ela tenha as características: ligada (boolean), canal (int) e volume (int)
2. Nossa TV poderá ser ligada e desligar, mudando o estado ligada
3. Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1
4. Nossa TV poderá mudar de canal de 1 em 1 definindo o número correspondente

*/

public class SmartTv {

    // Criação das variáveis
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // Criação do método mudarCanal, que tem como parâmetro a variável inteira "novoCanal"
    public void mudarCanal(int novoCanal) {
        canal = novoCanal; // Muda o canal para o valor especificado na utilização do método
    }

    // Criação do método aumentarCanal, que incrementa o valor do canal 
    public void aumentarCanal() {
        canal++;
    }

    // Criação do método diminuirCanal, que decrementa o valor do canal 
    public void diminuirCanal() {
        canal--;
    }

    // Criação do método aumentarVolume, que incrementa o valor do volume
    public void aumentarVolume() {
        volume++;
        // Printa o valor do volume atual quando chamado o método
        System.out.println("Aumentando o volume para: " + volume);
    }

    // Criação do método diminuirVolume, que decrementa o valor do volume
    public void diminuirVolume() {
        volume--;
        // Printa o valor do volume atual quando chamado o método
        System.out.println("Diminuindo o volume para: " + volume);
    }

    // Criação do método ligar, que muda o estado da variável booleana "ligada" para "true"
    public void ligar() {
        ligada = true;
    }

    // Criação do método desligar, que muda o estado da variável booleana "ligada" para "false"
    public void desligar() {
        ligada = false;
    }
}