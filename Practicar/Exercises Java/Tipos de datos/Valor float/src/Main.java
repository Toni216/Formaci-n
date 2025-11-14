import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una distancia en metros: ");
        float metros = scanner.nextFloat();
        System.out.println("Introduce el tiempo necesario (horas necesarias)");
        float horas = scanner.nextFloat();
        System.out.println("Introduce el tiempo necesario (minutos necesarias)");
        float minutos = scanner.nextFloat();
        System.out.println("Introduce el tiempo necesario (segundos necesarias)");
        float segundos = scanner.nextFloat();

        // 1 milla = 1609 metros


        float segundosTotales = (horas * 3660) + (minutos * 60) + segundos;
        System.out.println(segundosTotales);

        float mps = metros / segundosTotales;
        float kph = (metros/1000) / (segundosTotales / 3600);
        float mph = kph / 1.609f;

        System.out.println("La velocidad en metros/seg es " + mps);
        System.out.println("La velocidad en km/h es " + kph);
        System.out.println("La velocidad en millas/h es " + mph);
    }
}