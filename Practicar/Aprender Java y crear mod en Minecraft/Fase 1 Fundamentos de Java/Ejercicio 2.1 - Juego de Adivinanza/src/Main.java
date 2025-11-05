import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Programa que:
        // 1. Genere un número aleatorio (1-100)
        // 2. Pida al usuario que lo adivine
        // 3. Dé pistas ("mayor", "menor")
        // 4. Límite de 10 intentos
        // 5. Lleve contador de intentos
        Scanner scanner = new Scanner(System.in);

        double random = Math.random();
        double aleatorio = random * 100;
        int numRandom = (int) aleatorio;

        int intentos = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Adivina el número!");
            int adivinar = scanner.nextInt();

            if (adivinar == numRandom) {
                System.out.println("¡Enhorabuena, has acertado!");
                break;
            } else if (adivinar < numRandom) {
                System.out.println("¡Fallaste! El número es mayor, este es tu intento número " + (i+1));
            } else {
                System.out.println("¡Fallaste! El número es menor, este es tu intento número " + (i+1));
            }
        }
    }
}
