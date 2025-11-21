import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer número");
        int x = scanner.nextInt();
        System.out.println("Introduce el segundo número");
        int y = scanner.nextInt();

        System.out.println("¿Qué operación deseas hacer?");
        System.out.println("sumar, restar, multiplicar o dividir");
        String operacion = scanner.next();

        if (operacion.equals("sumar")) {
            int resultado = x + y;
            System.out.println(resultado);
        } else if (operacion.equals("restar")) {
            int resultado = x - y;
            System.out.println(resultado);
        } else if (operacion.equals("multiplicar")) {
            int resultado = x * y;
            System.out.println(resultado);
        } else if (operacion.equals("dividir")) {
            int resultado = x / y;
            System.out.println(resultado);
        } else {
            System.out.println("Esta opción no está disponible.");
        }
    }
}