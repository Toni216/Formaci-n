import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int x = scanner.nextInt();
        System.out.println("Introduzca otro numero");
        int y = scanner.nextInt();
        boolean esPar = (x % 2 == 0) && (y % 2 == 0);

        if (esPar) {
            System.out.println("Es un numero par");
        } else {
            System.out.println("No lo es");
        }
    }
}