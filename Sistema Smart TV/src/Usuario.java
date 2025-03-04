/* Projeto: Criar um exemplo de uma classe para representar uma SmartTV, onde:

1. Ela tenha as características: ligada (boolean), canal (int) e volume (int)
2. Nossa TV poderá ser ligada e desligar, mudando o estado ligada
3. Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1
4. Nossa TV poderá mudar de canal de 1 em 1 definindo o número correspondente

*/

public class Usuario {
    public static void main(String[] args) throws Exception {

        // Instancia a SmartTV
        SmartTv smartTv = new SmartTv();

        // Aqui utiliza-se dos métodos de diminuir e aumentar volume, que é inicializado com valor 25

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        // Imprime o valor do canal atual, que é inicializado com valor 1
        System.out.println("Canal atual: " + smartTv.canal);

        // Método mudanCanal,, mudando o canal para 13
        smartTv.mudarCanal(13);

        // Imprime "Canal atual: 13"
        System.out.println("Canal atual: " + smartTv.canal);

        // Imprime o volume atual, após utilizar os métodos de aumentar e diminuir
        System.out.println("Volume atual:  " + smartTv.volume);

        // Imprime o status da TV, se está ligada será "true", se desligada, "false". Ela é inicializada com valor "false"
        System.out.println("TV Ligada? " + smartTv.ligada);

        // Imprime o canal atual
        System.out.println("Canal atual: " + smartTv.canal);
        
        // Imprime o volume atual
        System.out.println("Volume atual:  " + smartTv.volume);
    
        // Utiliza o método para ligar a TV
        smartTv.ligar();

        // Imprime o novo status após utilização do método
        System.out.println("Novo status -> " + smartTv.ligada);
        

        // Utiliza o método para desligar a TV
        smartTv.desligar();

        // Imprime o novo status após utilização do método
        System.out.println("Novo status -> " + smartTv.ligada);
    }
}
