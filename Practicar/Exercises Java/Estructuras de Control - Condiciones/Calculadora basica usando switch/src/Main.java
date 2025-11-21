import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecciona el primer número de la operación: ");
        double x = scanner.nextDouble();
        System.out.println("¿Que operación deseas hacer?");
        char opcion = scanner.next().charAt(0);
        System.out.println("Selecciona el segundo número de la operación: ");
        double y = scanner.nextDouble();

        switch (opcion){
            case '+':
                double resultado =  x + y;
                System.out.println(String.format("%.2f",resultado));
                break;
            case '-':
                resultado = x - y;
                System.out.println(String.format("%.2f",resultado));
                break;
            case '*':
                resultado = x * y;
                System.out.println(String.format("%.2f",resultado));
                break;
            case '/':
                if (y == 0) {
                    System.out.println("División por cero no permitida");
                } else {
                    resultado = x / y;
                    System.out.println(String.format("%.2f",resultado));
                }
                break;
            default:
                System.out.println("Carácter no reconocido");
        }
        scanner.close();

    }
}