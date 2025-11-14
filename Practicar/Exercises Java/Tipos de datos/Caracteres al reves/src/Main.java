import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer caracter: ");
        char a = scanner.next().charAt(0);
        System.out.println("Introduce el segundo caracter: ");
        char b = scanner.next().charAt(0);
        System.out.println("Introduce el tercer caracter: ");
        char c = scanner.next().charAt(0);



        System.out.println(c + " " + b + " " + a);
    }
}