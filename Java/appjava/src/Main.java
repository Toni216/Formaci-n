import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        byte valor = sc.nextByte();
        System.out.println("Tu edad es " + valor);
    }
}