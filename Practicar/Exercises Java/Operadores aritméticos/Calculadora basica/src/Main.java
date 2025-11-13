import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        int x = scanner.nextInt();
        System.out.println("Introduzca el segundo número: ");
        int y = scanner.nextInt();

        int suma = x + y;
        int resta = x - y;
        int multiplicacion = x * y;
        int division;
        int resto = x % y;

        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplicacion);
        if (y != 0) {
            division = x / y;
            System.out.println(division);
        } else {
            System.out.println("No se puede dividir entre 0");
        }
        System.out.println(resto);



    }
}