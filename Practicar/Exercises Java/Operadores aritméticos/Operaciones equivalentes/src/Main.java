import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Escriba un programa en Java que solicite
         * tres números (a, b, c) y muestre el
         * resultado de (a+b)*c
         * y el resultado de a*c + b*c.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        int a = scanner.nextInt();
        System.out.println("Introduce el segundo número: ");
        int b = scanner.nextInt();
        System.out.println("Introduce el tercer número: ");
        int c = scanner.nextInt();

        int primero = (a + b) * c;
        System.out.println("El primer cálculo es (" + a + "+" + b + ")*" + c );
        System.out.println("Su resultado es " + primero);

        int segundo = a * c + b * c;
        System.out.println("El segundo cálculo es " + a + "*" + c + " + " + b + "*" + c );
        System.out.println("Su resultado es " + segundo);

    }
}