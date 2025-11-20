package genericos;

public class Utils {
    public static <T extends Number> T max(T a, T b) {
        return a.doubleValue() > b.doubleValue() ? a : b;
    }

    public static <T extends Garzon> Lista<T> sorter(Lista<T> lista) {
        return lista;
    }
}
