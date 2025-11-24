import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el primer numero");
        int x = scanner.nextInt();
        System.out.println("Introduzca el segundo numero");
        int y = scanner.nextInt();
        System.out.println("Introduzca el tercer numero");
        int s = scanner.nextInt();

        if (x > y && x > s) {
            System.out.println("El mayor es " + x);
        } else if (y > x && y > s) {
            System.out.println("El mayor es " + y);
        } else {
            System.out.println("El mayor es " + s);
        }
    }
}