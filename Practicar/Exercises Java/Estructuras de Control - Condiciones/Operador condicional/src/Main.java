import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el primer número");
        int a = scanner.nextInt();
        System.out.println("Introduzca el segundo número");
        int b = scanner.nextInt();

        String resultadoA = (a > 0) ? "A es positivo" : "A es negativo";
        String resultadoB = (b > 0) ? "B es positivo" : "B es negativo";
        String resultadoAmbos = (a > 0) && (b > 0) ? "Ambos son positivos" : "Ambos no son positivos";

        System.out.println("resultadoA = " + resultadoA);
        System.out.println("resultadoB = " + resultadoB);
        System.out.println("resultadoAmbos = " + resultadoAmbos);
    }
}