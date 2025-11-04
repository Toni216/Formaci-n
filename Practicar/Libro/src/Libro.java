public class Libro {
    String titulo;
    String autor;
    int isbn;
    int numPaginas;
    boolean prestado;

    public Libro(String titulo, String autor, int isbn, int numPaginas, boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numPaginas = numPaginas;
        this.prestado = prestado;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void prestar() {
        prestado = true;
    }

    public void devolver() {
        prestado = false;
    }

    public boolean estaPrestado() {
        System.out.println(prestado);
        return prestado;
    }

    public void mostrarInfo() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("isbn: " + isbn);
        System.out.println("Número de páginas: " + numPaginas);
        System.out.println("¿Está prestado? " + prestado);
    }
}
