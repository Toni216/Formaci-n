import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el primer número");
        int x = scanner.nextInt();
        System.out.println("Introduzca el segundo número");
        int y = scanner.nextInt();

        int cantidad = ((x > 0) && (y > 0)) ? 2 : ((x > 0) || (y > 0)) ? 1 : 0;

        System.out.println("La cantidad de números positivos es de: " + cantidad);
    }
}