import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un caracter: ");
        char caracter = scanner.next().charAt(0);

        switch (caracter) {
            case 'a','e','i','o','u':
                System.out.println("El caracter introducido es una vocal");
                break;
            default:
                System.out.println("El caracter introducido es otro simbolo");
                break;
        }
        scanner.close();
    }
}