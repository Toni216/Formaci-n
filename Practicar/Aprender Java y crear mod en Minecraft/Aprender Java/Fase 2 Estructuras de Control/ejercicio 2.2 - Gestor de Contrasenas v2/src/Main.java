import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Sistema que:
         * Valide fortaleza de contraseñas
         * siga las reglas: mínimo 8 chars, mayúsculas, número y símbolo
         * Clasifique débil, media y fuerte.
         * Genere contraseñas seguras automáticamente
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Gestor de Contraseñas ---");
        System.out.println("1. Validar contraseña");
        System.out.println("2. Generar contraseña segura");
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

    public static void validarContraseña() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba su contraseña: ");
        String contraseña = scanner.nextLine();

        int reglas = 0;

        boolean longitud = contraseña.length() >= 8;
        boolean mayusculas = contraseña.matches(".*[A-Z].*");
        boolean numeros = contraseña.matches(".*[0-9].*");
        boolean simbolos = contraseña.matches(".*[^A-Za-z0-9].*");

        if (longitud) { reglas++; }
        if (mayusculas) {reglas++; }
        if (numeros) {reglas++; }
        if (simbolos) {reglas++; }

        String segura;
        if (reglas == 4) {
            segura = "Fuerte";
        } else if (reglas >= 2) {
            segura = "Media";
        } else {
            segura = "Baja";
        }

        System.out.println("Tu contraseña " + contraseña + " es " + segura);


    }

    public static void generarContraseña() {
        Random random = new Random();

        String mayusculas = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String minusculas = mayusculas.toLowerCase();
        String números = "0123456789";
        String simbolos = "-_.,?¿¡&%$#!";

        StringBuilder contraseña = new StringBuilder();

        contraseña.append(mayusculas.charAt(random.nextInt(mayusculas.length())));
        contraseña.append(minusculas.charAt(random.nextInt(minusculas.length())));
        contraseña.append(números.charAt(random.nextInt(números.length())));
        contraseña.append(simbolos.charAt(random.nextInt(simbolos.length())));

        System.out.println(contraseña);

        String allChar = mayusculas + minusculas + números + simbolos;
        for (int i = 0; i < 10; i++) {
            contraseña.append(allChar.charAt(random.nextInt(allChar.length())));
        }

        System.out.println(contraseña);
        System.out.println(minusculas);
        String contraseñaMezclada = mezclarContraseña(contraseña.toString());
        System.out.println(contraseñaMezclada);
    }

    public static String mezclarContraseña(String cadena) {
        char[] caracteres = cadena.toCharArray();
        Random random = new Random();

        for (int i = 0; i < caracteres.length; i++) {
            int posicionAleatoria = random.nextInt(caracteres.length);
            char temp = caracteres[i];
            caracteres[i] = caracteres[posicionAleatoria];
            caracteres[posicionAleatoria] = temp;
        }

        return new String(caracteres);
    }
}