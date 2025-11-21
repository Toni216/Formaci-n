import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int x = scanner.nextInt();

        System.out.println("El valor absoluto del número introducido es de " + Math.abs(x));

    }
}