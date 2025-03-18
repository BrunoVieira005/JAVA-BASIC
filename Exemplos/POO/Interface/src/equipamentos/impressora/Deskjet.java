package equipamentos.impressora;

// Classe Deskjet implementa a interface Impressora
public class Deskjet implements Impressora {
    
    @Override
    public void imprimir() {
        System.out.println("Imprimindo via DESKJET");    
    }
}
