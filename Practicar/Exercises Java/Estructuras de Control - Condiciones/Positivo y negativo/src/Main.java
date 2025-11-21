import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es positivo");
        }
    }
}