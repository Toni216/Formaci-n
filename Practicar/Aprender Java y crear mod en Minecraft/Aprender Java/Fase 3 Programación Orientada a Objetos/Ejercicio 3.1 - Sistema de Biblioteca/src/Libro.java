public class Libro {
    private String titulo;
    private String autor;
    private String ISBN;
    private boolean prestado;

    public Libro(String titulo, String autor, String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.prestado = false;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getIsbn() { return ISBN; }
    public boolean isPrestado() { return prestado; }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
}
