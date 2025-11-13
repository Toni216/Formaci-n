import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Escribe un programa en Java
         * que calcule la medía
         * aritmética de 4 factores
         * introducidos por el usuario,
         * uno por cada linea.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la primera nota");
        int nota1 = scanner.nextInt();
        System.out.println("Introduce la segunda nota");
        int nota2 = scanner.nextInt();
        System.out.println("Introduce la tercera nota");
        int nota3 = scanner.nextInt();
        System.out.println("Introduce la cuarta nota");
        int nota4 = scanner.nextInt();

        int media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("La media es de " + media);

    }
}