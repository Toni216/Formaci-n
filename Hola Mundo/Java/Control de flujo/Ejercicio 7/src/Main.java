import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Introduce un número: ");
        numero = sc.nextInt();

        for (int i = 0;i < numero;i++){
            if (i % 2 == 0){
                System.out.println(i + " es un número par");
            } else {
                System.out.println(i + " es un número impar");
            }
        }
    }
}