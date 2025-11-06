import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /**
         * Sistema que:
         * Valide fortaleza de contraseñas
         * siga las reglas: mínimo 8 chars, mayúsculas, número y símbolo
         * Clasifique débil, media y fuerte.
         * Genere contraseñas seguras automáticamente
         */

        System.out.println("=== GESTOR DE CONTRASEÑAS ===");
        System.out.println("1. Validar contraseña");
        System.out.println("2. Generar contraseña");
        System.out.println("Elige una opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                validarContraseña();
                break;
            case 2:
                generarContraseña();
                break;

        }
    }

    public static void validarContraseña(){
        Scanner scanner = new Scanner(System.in);
        boolean validez = false;
        do{
            System.out.println("Escriba una contraseña: ");
            String password = scanner.next();
            if (password.length() <= 8) {
                System.out.println("Tu contraseña tiene que tener mínimo 8 caracteres");
            } else if (!password.matches(".*[A-Z].*")) {
                System.out.println("Tu contraseña tiene que tener mínimo 1 mayúscula");
            } else if (!password.matches(".*[0-9].*")) {
                System.out.println("Tu contraseña debe tener números");
            } else if (!password.matches(".*[^a-z0-9A-Z].*")) {
                System.out.println("Tu contraseña debe tener símbolos");
            } else {
                System.out.println("Tu contraseña está bien");
                break;
            }
        } while (!validez);
    }

    public static void generarContraseña(){
        Random random = new Random();

        String minusculas = "abcdefghijklmnoñopqrstuwxyz";
        String mayusculas = minusculas.toUpperCase();
        String numeros = "0123456789";
        String simbolos = "!@#$_~^'&*--.,";

        StringBuilder contraseña = new StringBuilder();

        // Con esto aseguramos que la contraseña tenga al menos 1 de cada tipo
        contraseña.append(mayusculas.charAt(random.nextInt(mayusculas.length())));
        contraseña.append(numeros.charAt(random.nextInt(numeros.length())));
        contraseña.append(simbolos.charAt(random.nextInt(simbolos.length())));

        String allCharacter = minusculas + mayusculas + numeros + simbolos;
        for (int i = 0; i < 10 ; i++) {
            contraseña.append(allCharacter.charAt(random.nextInt(allCharacter.length())));
        }

        System.out.println(contraseña);
    }


}