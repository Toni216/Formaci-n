import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Cree un programa en Java para
         * convertir de grados centígrados
         * a Kelvin y Fahrenheit.
         * Solicite al usuario la cantidad de
         * grados centígrados para convertirlos
         * usando las siguientes tablas de conversión:
         *
         *     kelvin = celsius + 273
         *     fahrenheit = celsius x 18/10 + 32
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca los celsius");
        int celsius = scanner.nextInt();

        int kelvin = celsius + 273;
        int fahrenheit = celsius * 18/10 + 32;

        System.out.println(celsius + " celsius son " + kelvin + " kelvin");
        System.out.println(celsius + " celsius son " + fahrenheit + " fahrenheit");
    }
}