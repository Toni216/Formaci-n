import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char nota;

        System.out.println("Ingrese la nota: ");
        int calificacion = sc.nextInt();

        if (calificacion >= 90) {
            nota = 'A';
        } else if (calificacion >= 80) {
            nota = 'B';
        } else if (calificacion >= 70) {
            nota = 'C';
        } else if (calificacion >= 60) {
            nota = 'D';
        } else {
            nota = 'F';
        }

        System.out.println("Tu calificación es: " + nota);
    }
}