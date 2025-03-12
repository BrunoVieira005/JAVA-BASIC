package estruturas.condicionais;
public class SistemaMedida {
    public static void main(String[] args) {
        String medida = "M";

        // Switch Case
        switch (medida) {
            case "M":
                System.out.println("MÉDIA");
                break;
            case "P":
                System.out.println("PEQUENA");
                break;
            case "G":
                System.out.println("GRANDE");
                break;
            default:
                System.out.println("Indefinido");
        }
    }
}
