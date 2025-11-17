import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Introduzca el primer número entero: ");
        int num1 = scanner.nextInt();
        System.out.println("Introduzca el segundo número entero: ");
        int num2 = scanner.nextInt();

        int numRandom = random.nextInt(num1,num2);

        System.out.println(numRandom);


    }
}