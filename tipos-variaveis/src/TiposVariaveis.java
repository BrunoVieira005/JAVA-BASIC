public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
    
        // Declaração de uma variável do tipo short (2 bytes)
        short numeroCurto = 1;
        
        // Conversão implícita (Widening): short → int (int é maior, então não precisa de casting)
        int numeroNormal = numeroCurto;
        
        // Conversão explícita (Narrowing): int → short (precisa de casting porque pode perder dados)
        short numeroCurto2 = (short) numeroNormal;
    
        // Variáveis 

        int numero = 5;

        numero = 10;

        System.out.println(numero);

        // Constantes

        final double VALOR_DE_PI = 3.14;

        // Para declarar uma variável como constante, ela deve conter a palavra final antes da declaração
        // E ser escrita em CAPS LOCK

        // A tentativa de alteração do valor da variável VALOR_DE_PI declarada acima, resultaria em erro.
    
    }
}
