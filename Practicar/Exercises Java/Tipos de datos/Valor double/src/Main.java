import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el ancho del rectángulo: ");
        double x = scanner.nextDouble();
        System.out.println("Introduce la altura del rectángulo: ");
        double y = scanner.nextDouble();

        double perimetro = (x + y) * 2;
        double area = x * y;
        double diagonal = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));

        System.out.println(perimetro);
        System.out.println(area);
        System.out.println(diagonal);
    }
}