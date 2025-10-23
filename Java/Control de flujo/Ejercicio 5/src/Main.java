import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la nota:");
        char nota = sc.next().charAt(0);

        switch (nota) {
            case 'A':
                System.out.println("La nota 'A' equivale a un rango de calificación de 90-100.");
               break;
            case 'B':
                System.out.println("La nota 'A' equivale a un rango de calificación de 80-89.");
                break;
            case 'C':
                System.out.println("La nota 'A' equivale a un rango de calificación de 70-79.");
                break;
            case 'D':
                System.out.println("La nota 'A' equivale a un rango de calificación de 60-69.");
                break;
            case 'F':
                System.out.println("La nota 'A' equivale a un rango de calificación menor a 60.");
                break;
            default:
                System.out.println("Nota no válida. Ingrese A, B, C, D o F.");
        }

    }
}