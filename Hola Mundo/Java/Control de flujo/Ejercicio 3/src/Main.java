import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contraseña = "1234";

        System.out.println("Ingrese contraseña: ");
        String inicioSesion = sc.next();
        if (inicioSesion.equals(contraseña)){
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }
    }
}