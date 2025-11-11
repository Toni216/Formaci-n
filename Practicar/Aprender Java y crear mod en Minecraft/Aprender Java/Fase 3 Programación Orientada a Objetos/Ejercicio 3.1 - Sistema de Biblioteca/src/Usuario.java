import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String ID;
    private List<Libro> librosPrestados;

    public Usuario(String nombre, String ID) {
        this.nombre = nombre;
        this.ID = ID;
        this.librosPrestados = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public String getID() { return ID; }
    public List<Libro> getLibrosPrestados() { return librosPrestados; }

    public void agregarLibro(Libro libro) {
        librosPrestados.add(libro);
    }

    public void removeLibro(Libro libro) {
        librosPrestados.remove(libro);
    }
}
