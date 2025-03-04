public class Operadores {
    public static void main(String[] args) {

        // Operador ternário

        int a, b;
        a = 5; 
        b = 6;

        String resultado = a == b ? "Verdadeiro" : "Falso";

        System.out.println(resultado);


        // Operador relacional

        int num1 = 1;
        int num2 = 2;

        // Variável simNao, de tipo booleana, verifica se a variável num1 é igual a num 2
        boolean simNao = num1 == num2;

        // Imprime a mensagem e concatena o estado da variável booleana
        System.out.println("Número 1 é igual ao número 2? " + simNao);

        simNao = num1 != num2;

        System.out.println("Número 1 é diferente de número 2? " + simNao);

        simNao = num1 > num2;

        System.out.println("Número 1 é maior que o número 2? " + simNao);


        // Operadores lógicos

        boolean condicao1 = true;

        boolean condicao2 = true;

        if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        }
        if (condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }
        System.out.println("Fim");
    }
}
