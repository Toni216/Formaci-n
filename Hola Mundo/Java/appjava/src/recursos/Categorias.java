package recursos;

public class Categorias extends Base{
    public Categorias(String name) {
        super(name);
        System.out.println("Soy categorias ");
    }

    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
