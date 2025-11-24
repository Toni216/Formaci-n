import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca la calificación: ");
        int nota = scanner.nextInt();

        switch (nota) {
            case 10:
                System.out.println("Matrícula de honor");
                break;
            case 9:
                System.out.println("Sobresaliente");
                break;
            case 7,8:
                System.out.println("Notable");
                break;
            case 6:
                System.out.println("Aprobado");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 0,1,2,3,4:
                System.out.println("Suspenso");
                break;
            default:
                System.out.println("La nota introducida no es válida");
        }
    }
}