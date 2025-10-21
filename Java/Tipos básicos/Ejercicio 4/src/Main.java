import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Pedir primero el nombre
         * Luego los apellidos
         *
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese sus apellidos: ");
        String apellidos = sc.nextLine();
        System.out.println("Tu nombre completo es: " + nombre + " " + apellidos);
    }
}