import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int cajaRegistradora = 100;

        System.out.println("Introduzca el precio del producto: ");
        int precio = scanner.nextInt();
        System.out.println("Introduzca la cantidad a pagar: ");
        int pagar = scanner.nextInt();
        int cambio = pagar - precio;
//        int resto;

        while (cambio >= 100) {
            System.out.println("100 ");
            cambio -= 100;
        }

        while (cambio >= 50) {
            System.out.println("50 ");
            cambio -= 50;
        }

        while (cambio >= 20) {
            System.out.println("20 ");
            cambio -= 20;
        }

        while (cambio >= 10) {
            System.out.println("10 ");
            cambio -= 10;
        }

        while (cambio >= 5) {
            System.out.println("5 ");
            cambio -= 5;
        }

        while (cambio >= 2) {
            System.out.println("2 ");
            cambio -= 2;
        }

        while (cambio >= 1) {
            System.out.println("1 ");
            cambio -= 1;
        }
    }
}