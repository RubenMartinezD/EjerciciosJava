import java.util.Random;

public class Partida {
    Usuario jugador_1 = new Usuario();
    Maquina CPU = new Maquina();
    int numero_ronda = 0;
    int rondas_totales;
    public static int binarandomV2() {
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
