import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el mínimo");
        int min = scanner.nextInt();
        System.out.println("Introduzca el máximo");
        int max = scanner.nextInt();

        for (int x = min; x <= max ; x++){
            int y = x * x - 2 * x + 1;
            System.out.print(y + " ");
        }
    }
}