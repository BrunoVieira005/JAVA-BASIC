package edu.bruno.segundasemana;

public class MinhaClasse {
    public static void main(String [] args) {

        // Declaração de variáveis

        String meuNome = "Bruno";
        int anoFabricacao = 2021;

        boolean verdadeira = true;
        boolean falsa = false;

        // Alteração do valor da variável
        anoFabricacao = 2022;

        // Criação das variáveis primeiroNome e segundoNome para utilização no método
        String primeiroNome = "Bruno";
        String segundoNome = "Ricardo";

        // Criação da String nomeCompleto, que faz a chamada do método com o mesmo nome e passa os parâmetros exigidos
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        // Impressão 
        System.out.println(nomeCompleto);
    }
    
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome); 
    }   
}
