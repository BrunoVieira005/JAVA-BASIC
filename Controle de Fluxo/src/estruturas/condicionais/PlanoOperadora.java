package estruturas.condicionais;
public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M"; //M / T

        switch (plano) {
        case "B": 
        System.out.println("100 minutos de ligação");
        break;
        case "M": 
        System.out. println("WhatsApp e Instagram grátis");
        break;
        case "T":
        
        System.out.println("5Gb Youtube");
        break;
        default:
        System.out.println("Opção inválida");
    }
}
}
