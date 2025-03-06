public class ResultadoEscolar {
    public static void main(String[] args) {

        // Condicional encadeada
        int nota = 8;

        if (nota >= 7) 
            System.out.println("Aprovado");

        else if (nota >= 5 && nota < 7) 
            System.out.println("Prova de Recuperação");
            
        else 
            System.out.println("Reprovado");
        
        // Condição ternária

        int nota_2 = 4;

        String resultado = nota_2 >= 7 ? "Aprovado" : nota_2 >=5 && nota_2 < 7 ? "Recuperação" :"Reprovado";
        System.out.println(resultado);
    }
}
