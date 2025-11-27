import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        int x =  scanner.nextInt();

        while (x != 0) {
            System.out.println(x * 10);
            System.out.println("Introduzca un número: ");
            x =  scanner.nextInt();
        }
    }
}