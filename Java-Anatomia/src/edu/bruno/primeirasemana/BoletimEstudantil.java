// Anatomia das Classes - 4 - Identação

package edu.bruno.primeirasemana;

public class BoletimEstudantil {
    // Exemplo do método sem identação
    /* public static void main(String[] args) {
        int mediaFinal = 7;
        if(mediaFinal<6) 
        System.out.println("Reprovado");
        else if (mediaFinal == 6)
        System.out.println("Prova Minerva");
        else
        System.out.println("Aprovado");
    }
    */

    // Com identação
    public static void main(String[] args) {
        int mediaFinal = 7;
        if(mediaFinal<6) 
            System.out.println("Reprovado");
        else if (mediaFinal == 6)
            System.out.println("Prova Minerva");
        else
            System.out.println("Aprovado");
    }
}
