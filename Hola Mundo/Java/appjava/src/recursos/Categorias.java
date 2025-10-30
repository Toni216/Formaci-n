package recursos;

public class Categorias extends Base {
    public Categorias(String name) {
        super(name);
        System.out.println("Soy categorias");
    }

    public String toString() {
        return this.name;
    }

    public String miMetodo() {
        return "chao mundo";
    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void metodoCategoria() {
        System.out.println("soy instancia de categoria");
    }
}
