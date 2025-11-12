import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        int x = scanner.nextInt();
        System.out.println("Introduzca el segundo número: ");
        int y = scanner.nextInt();

        if (y != 0) {
            int division = x / y;
            System.out.println(division);
        } else {
            System.out.println("No se puede dividir entre 0");
        }
    }
}