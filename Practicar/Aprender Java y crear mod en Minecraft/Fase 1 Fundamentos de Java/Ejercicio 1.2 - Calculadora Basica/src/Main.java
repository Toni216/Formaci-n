import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Crea una calculadora que:
        // 1. Pida dos números
        // 2. Realice las 4 operaciones básicas
        // 3. Maneje división por cero
        // 4. Formatee los resultados (2 decimales)
        System.out.println("Elija el primer número: ");
        float a = scanner.nextFloat();
        System.out.println("Elija el segundo número: ");
        float b = scanner.nextFloat();



        System.out.println("Elija una opción:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");

        int opcion = scanner.nextInt();

        float resultado;
        switch (opcion) {
            case 1:
                resultado = a + b;
                System.out.println(resultado);
                break;
            case 2:
                resultado = a - b;
                System.out.println(resultado);
                break;
            case 3:
                resultado = a * b;
                System.out.println(resultado);
                break;
            case 4:
                resultado = a/ b;
                System.out.println(resultado);
                break;
            case 5:
                System.out.println("Saliendo de la calculadora...");
                break;
        }
    }


}