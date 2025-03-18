package equipamentos.multifuncional;

// Importa os equipamentos Copiadora, Digitalizadora e Impressora, de seus devidos pacotes

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

// Implementa as interfaces Copiadora, Digitalizadora e Impressora
public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    
    // Quando os métodos forem chamados enquanto o equipamento multifuncional for instanciado, exibe as respectivas mensagens
    public void copiar() {  
        System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
    public void digitalizar() {
        System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
    public void imprimir() {
        System.out. println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
}    
