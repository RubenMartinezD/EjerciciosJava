import java.util.Scanner;

public class Usuario extends Participante {
    public Usuario() {
        super();
    }

    public Usuario(int victorias, int derrotas, String nombre) {
        super(victorias, derrotas, nombre);
    }

    public static int recogerCadena() {
        Scanner escanercito = new Scanner(System.in);
        System.out.println("Escribe Cara o Cruz y te daré un 1 o un 0");
        String recogida_input = escanercito.nextLine();
        int numerandom = 999999999;
        if (recogida_input.contains("cara") || recogida_input.contains("Cara") || recogida_input.contains("CARA")) {
            numerandom = 1;
            System.out.println(numerandom);
        } else if (recogida_input.contains("cruz") || recogida_input.contains("Cruz") || recogida_input.contains("CRUZ")) {
            numerandom = 0;
            System.out.println(numerandom);
        } else {
            System.out.println("Error. Escribe Cara o Cruz");
        }
        return (numerandom);
    }
}
