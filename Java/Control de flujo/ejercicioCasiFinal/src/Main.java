import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        while (true) {
            System.out.println("Elige una opción: ");
            System.out.println("1. Calculadora");
            System.out.println("2. Hackear NASA");
            System.out.println("3. Salir");

            input = sc.nextInt();

            if (input == 1){
                int num1;
                int num2;
                System.out.println("Escribe el primer número:");
                num1 = sc.nextInt();
                System.out.println("Escribe el segundo número:");
                num2 = sc.nextInt();
                System.out.println(num1 + num2);
                continue;
            }

            if (input == 2) {
                String[] hacker = {"#","##","###","####"};
                System.out.println("Hackeando nasa");
                for (String nasa: hacker){
                    System.out.println(nasa);
                }
                System.out.println("Listo, eres hackerman!");
                continue;
            }

            if (input == 3) {
                break;
            }
        }
    }
}