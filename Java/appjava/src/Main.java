import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /**
         * Crear una calculadora que reciba
         * 2 numeros y luego imprima el resultado de la
         * suma de dos números
         */
        System.out.println("Esta es una aplicación de calculadora");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número para la suma: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo número para la suma: ");
        int num2 = sc.nextInt();
        System.out.println("La suma de los dos números es: " + (num1 + num2));
    }
}