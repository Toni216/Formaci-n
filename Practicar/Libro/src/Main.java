public class Main {
    public static void main(String[] args) {
        // Crea una clase Libro con:
        // - Atributos: titulo, autor, isbn, numPaginas, prestado (boolean)
        // - Métodos:
        //   • prestar() - cambia el estado a prestado
        //   • devolver() - cambia el estado a disponible
        //   • estaPrestado() - retorna true/false
        //   • mostrarInfo() - muestra toda la información del libro

        Libro libro = new Libro("Geronimo Stilton",
                                "Paco de Candela",
                                123123123,
                                232,
                                false);

        libro.mostrarInfo();

        libro.prestar();

        libro.estaPrestado();

        libro.devolver();

        libro.estaPrestado();

        libro.prestar();
        libro.mostrarInfo();
    }
}
