import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int x = scanner.nextInt();
        System.out.println("Introduce las veces que quieres que se repita el número anterior: ");
        int y = scanner.nextInt();

        for (int i = 0; i < y; i++){
            System.out.print(x + " ");
        }
    }
}