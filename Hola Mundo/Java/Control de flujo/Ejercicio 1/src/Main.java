import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        double precio;
//        double descuento;
//
//        System.out.println("Ingresa una cantidad");
//        precio = sc.nextInt();
//        System.out.println("Ingresa su descuento");
//        descuento = sc.nextInt();
//        double porcentaje = descuento / 100;
//        double descontado = precio * porcentaje;
//        double precioFinal = precio - descontado;
//        System.out.println("$" + precioFinal);

        System.out.println("Ingresa el precio del producto: ");
        double precio = sc.nextDouble();

        System.out.println("Ingresa el porcentaje de descuento: ");
        double descuento = sc.nextDouble();

        double precioFinal = precio - (precio * descuento / 100);

        System.out.println("El precio final con descuento es: $" + precioFinal);

    }
}