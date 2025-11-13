import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Crea un programa en Java que solicite
         * un número entero x al usuario e imprima
         * el resultado de las siguientes operaciones:
         *
         *     -6 + x * 5
         *     (13-2) * x
         *     (x + -2) * (20 / 10)
         *     (12 + x) / (5 - 4)
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el número x: ");
        int x = scanner.nextInt();

        int primero = -6 + x * 5;
        int segundo = (13-2) * x;
        int tercero = (x + -2) * (20 / 10);
        int cuarto = (12 + x) / (5 - 4);

        System.out.println("Las primeras operaciones son igual a " + primero);
        System.out.println("Las segundas operaciones son igual a " + segundo);
        System.out.println("Las terceras operaciones son igual a " + tercero);
        System.out.println("Las cuartas operaciones son igual a " + cuarto);
    }
}