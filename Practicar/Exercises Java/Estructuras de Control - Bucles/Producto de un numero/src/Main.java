import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el primer número: ");
        int x = scanner.nextInt();
        System.out.println("Introduzca el segundo número: ");
        int y = scanner.nextInt();
        int resultado = 0;
        int i = 0;

//        for (int i = 0; i < y; i++) {
//            resultado = resultado + x;
//        }

        while(i < y) {
            resultado = resultado + x;
            i++;
        }

        System.out.println(resultado);


    }
}