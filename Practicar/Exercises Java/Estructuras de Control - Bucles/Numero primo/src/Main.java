import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        int x = scanner.nextInt();

        if (x % 1 == 0 && x % x == 0) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
    }
}