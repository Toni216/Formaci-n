import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número");
        int numero = scanner.nextInt();

        if (numero == 0) {
            System.out.println("Introduzca un número entero válido");
            return;
        }

        System.out.println("Los factores primos de " + numero + " son " );

        for (int i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                System.out.print(i + " ");
                numero /= i;
            }
        }

        System.out.println();
        scanner.close();
    }
}