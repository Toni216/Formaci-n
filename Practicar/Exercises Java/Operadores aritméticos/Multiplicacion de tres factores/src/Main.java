import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        System.out.println("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println("Introduce el tercer número: ");
        int num3 = scanner.nextInt();

        int multiplicacion = num1 * num2 * num3;

        System.out.println("El resultado de esta multiplicación es: " + multiplicacion);
    }
}