import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Crea un programa que:
        // 1. Salude al usuario
        // 2. Pida su nombre y edad
        // 3. Calcule el año de nacimiento
        // 4. Muestre toda la información

        System.out.println("¡Saludos usuario!");
        System.out.println("¿Como te llamas?");
        String name = scanner.nextLine();
        System.out.println("¿Que edad tienes?");
        int age = scanner.nextInt();
        int year = LocalDate.now().getYear() - age;

        System.out.println("===== INFORMACIÓN =====");
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
        System.out.println("Año de nacimiento: " + year);
        System.out.println("=======================");
    }
}