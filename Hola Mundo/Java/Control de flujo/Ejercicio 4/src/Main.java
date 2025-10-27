import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su salario: ");
        int salario = sc.nextInt();
        double impuesto;

        if (salario < 10000) {
            impuesto = salario * 0.05;
        } else if (salario < 30000) {
            impuesto = salario * 0.10;
        } else if (salario < 60000) {
            impuesto = salario * 0.20;
        } else {
            impuesto = salario * 0.30;
        }

        System.out.println("El impuesto a pagar es: $" + impuesto);
    }
}