import java.util.Scanner;

public class Main {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int num = scanner.nextInt();

        int numAlCuadrado = num * num;

        System.out.println("El número al cuadrado es " + numAlCuadrado);
    }
}