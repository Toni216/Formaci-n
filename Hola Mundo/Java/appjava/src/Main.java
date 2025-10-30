import recursos.Base;
import recursos.Categorias;


public class Main {
    public static void main(String[] args) {
        Categorias c = new Categorias("Telefono");
        Categorias c2 = new Categorias("Telefono");
        System.out.println(c == c2);
//        Base base = new Base("Hola");
//
//
//        miMetodo(c);
    }

    public static void miMetodo(Base base) {
        if (base instanceof Categorias) {
            var c = (Categorias)base;
            c.metodoCategoria();
        }
        System.out.println(base.getName());
    }
}