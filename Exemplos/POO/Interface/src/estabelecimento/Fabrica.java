package estabelecimento;

// Importa as interfaces e classe de seus devidos pacotes
import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.digitalizadora.Scanner;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        // Instancia um equipamento multifuncional, que pode ter diferentes funções
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        // Instancia objetos específicos para impressora e digitalizadora
        Deskjet deskjet = new Deskjet();
        Scanner scanner = new Scanner();

        // Atribuição dos objetos às interfaces apropriadas
        Impressora impressora = deskjet; // A impressora Deskjet é atribuída à variável de tipo Impressora.
        Digitalizadora digitalizadora = scanner; // O scanner é atribuído à variável Digitalizadora
        Copiadora copiadora = em; // O equipamento multifuncional é atribuído à variável Copiadora

        // Chama os métodos específicos das instâncias
        impressora.imprimir(); // Chama o método imprimir, da Deskjet
        digitalizadora.digitalizar(); // Chama o método digitalizar, do Scanner
        copiadora.copiar(); // Chama o método copiar, da Copiadora, que foi atribuído o equipamento multifuncional, exibindo então a mensagem genérica, para demonstração
    }
}
