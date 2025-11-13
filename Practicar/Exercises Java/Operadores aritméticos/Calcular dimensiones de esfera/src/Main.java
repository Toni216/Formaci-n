import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el radio: ");
        int radio = scanner.nextInt();

        double superficie = 4 * Math.PI * (radio * radio);
        double volumen = (4/3) * Math.PI * Math.pow(radio, 3);

        System.out.println("La superficie de la esfera es: " + superficie);
        System.out.println("El volumen de la esfera es: " + volumen);
    }
}