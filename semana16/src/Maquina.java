
import java.util.Random;
public class Maquina extends Participante {
    public Maquina() {
        super();
    }

    public Maquina(int victorias, int derrotas, String nombre) {
        super(victorias, derrotas, nombre);
    }

    public static int binarandom() {
        Random random = new Random();
        boolean flag = random.nextBoolean();
        int numerandom;

        if (flag == true) {
            numerandom = 1;
        } else {
            numerandom = 0;
        }
        System. out. println(numerandom);
        return (numerandom);
    }
}
