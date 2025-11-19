import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String[] jugadores = {
                "Toni", "Roci", "Feli",
                "Beja", "Puneno", "Oli",
                "Ale gemelo", "Fran gemelo",
                "Carlos", "Fran lefas",
                "Antonio", "Clara", "Óscar",
                "Claudia", "Diego", "Futuf",
                "Senan", "Monchis", "Laura",
                "Sar", "Jose", "UnFrikiMas",
                "Greshman"," "
        };

        java.util.List<String> lista = Arrays.asList(jugadores);
        Collections.shuffle(lista);


        String[] equipo1 = new String[jugadores.length / 2];
        String[] equipo2 = new String[jugadores.length / 2];

        for (int i = 0; i < jugadores.length / 2; i++) {
            equipo1[i] = jugadores[i];
            equipo2[i] = jugadores[i + jugadores.length / 2];
        }

        System.out.println("Son " + lista.toArray().length + " jugadores");
        System.out.println("Equipo 1: " + Arrays.toString(equipo1));
        System.out.println("Equipo 2: " + Arrays.toString(equipo2));
    }
}
