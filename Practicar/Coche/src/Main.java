public class Main {
    public static void main(String[] args) {
        // Crea una clase Coche con:
        // - Atributos: marca, modelo, año, velocidadActual
        // - Métodos:
        //   • acelerar(int incremento)
        //   • frenar(int decremento) - la velocidad no puede ser negativa
        //   • obtenerVelocidad()
        //   • mostrarEstado()
        Coche coche = new Coche("Toyota", "Camris", 2020, 0);
        System.out.println(coche.año);
        coche.acelerar(20);
        System.out.println(coche.obtenerVelocidad());
        coche.acelerar(200);
        System.out.println(coche.obtenerVelocidad());
        coche.frenar(100);
        System.out.println(coche.obtenerVelocidad());
        coche.frenar(125);
        System.out.println(coche.obtenerVelocidad());
    }
}