package equipamentos.impressora;

// Classe Laserjet implementa a interface Impressora
public class Laserjet implements Impressora{

    @Override
    public void imprimir() {
        System.out.println("Imprimindo via LASERJET");    
    }
}
