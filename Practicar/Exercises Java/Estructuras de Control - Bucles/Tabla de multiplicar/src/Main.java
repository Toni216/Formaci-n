import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        int x = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int multiplicacion = x * i;
            System.out.println(x + " x " + i + " = " + multiplicacion);
        }
    }
}