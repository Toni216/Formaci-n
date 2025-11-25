import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
            int x = scanner.nextInt();
        System.out.println("Introduzca otro número: ");
            int y = scanner.nextInt();

        while (x >= y) {
            if (x % 2 == 0) {
                x--;
            } else {
                System.out.print(x + " ");
                x--;
            }
        }
    }
}