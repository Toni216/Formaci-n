import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        int x = scanner.nextInt();

        do {
            if (x > 0) {
                System.out.println(x * 10);
            } else {
                System.out.println("No se puede hacer esta operación");
                break;
            }
            System.out.println("Introduzca de nuevo un número: ");
            x = scanner.nextInt();
        } while (x > 0);
    }
}