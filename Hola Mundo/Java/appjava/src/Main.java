import genericos.Lista;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>();
        lista.add("Juan");
        lista.add("Paco");
        var mirar = lista.get(1);

        System.out.println(mirar);
    }
}