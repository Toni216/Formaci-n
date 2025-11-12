import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el primer número: ");
        int num1 = scanner.nextInt();
        System.out.println("Introduzca el segundo número: ");
        int num2 = scanner.nextInt();

        int division = num1 / num2;

        int resto = num1 % num2;

        System.out.println(division);
        System.out.println(resto);
    }
}