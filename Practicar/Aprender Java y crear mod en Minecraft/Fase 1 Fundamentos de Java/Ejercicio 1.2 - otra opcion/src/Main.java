import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elige el primer número: ");
        float a = scanner.nextFloat();
        System.out.println("Elige le segundo número: ");
        float b = scanner.nextFloat();

        float suma = a + b;
        float resta = a - b;
        float multiplicacion = a * b;
        float division;
        if (b != 0) {
            division = a / b;
        } else {
            division = Float.NaN;
        }

        System.out.println("La suma de" + a + " + " + b + " es de " + suma);
        System.out.println("La resta de" + a + " - " + b + " es de " + resta);
        System.out.println("La suma de" + a + " * " + b + " es de " + multiplicacion);

        if (b != 0) {
            System.out.println("La suma de" + a + " / " + b + " es de " + division);
        } else {
            System.out.println("No se puede dividir por 0");
        }


    }
}