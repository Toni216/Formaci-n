import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;
    private List<Usuario> usuarios;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void prestarLibro(String ISBN, String usuarioID) {
        Libro libro = buscarLibroPorISBN(ISBN);
        Usuario usuario = buscarUsuarioPorID(usuarioID);

        if (libro == null) {
            System.out.println("ERROR: Libro no encontrado");
            return;
        }
        if (usuario == null) {
            System.out.println("ERROR: Usuario no encontrado");
            return;
        }

        if (libro.isPrestado()) {
            System.out.println("ERROR: El libro ya está prestado: ");
            return;
        }

        libro.setPrestado(true);
        usuario.agregarLibro(libro);

        System.out.println("Libro " + libro.getTitulo() + " prestado a " + usuario.getNombre());
    }

    public void devolverLibro(String ISBN, String usuarioID) {
        Libro libro = buscarLibroporISBN(ISBN);
        Usuario usuario = buscarUsuarioporID(usuarioID);

        if (libro == null || usuario == null) {
            System.out.println("ERROR: Libro o usuario no encontrado");
            return;
        }

        if (!libro.isPrestado()) {
            System.out.println("ERROR: El libro no estaba prestado");
            return;
        }

        libro.setPrestado(false);
        usuario.removeLibro(libro);

        System.out.println("Libro " + libro.getTitulo() + " devuelto por " + usuario.getNombre());
    }

    public void buscarLibro(String titulo) {
        System.out.println("Buscando libro: " + titulo);
        boolean encontrado = false;

        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libro.mostrarInfo();
                encontrado = true;
            }

            if (!encontrado) {
                System.out.println("No se encontró el libro " + titulo);
            }
        }
    }
}
