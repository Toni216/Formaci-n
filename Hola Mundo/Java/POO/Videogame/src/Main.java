public class Main {
    public static void main(String[] args) {
        /** EJERCICIO 1
         * Crear la clase VideoGame con las propiedades:
         * name string
         * price double
         * catogory string
         *
         * getters y setters para todas las propiedades
         *
         * EJERCICIO 2
         * Hacer una array para category que añada action, rpg, racing, etc.
         *
         * EJERCICIO 3
         * Pasar todo a mayuscula del String de getCategory y ponerle un . final
         *
         * EJERCICIO 4
         * Al crear una instancia, tiene que pedir el nombre y el precio
         * Si este es <10 se le asigna 10 automáticamente.
         *
         * EJERCICIO 5
         * Darle formato al precio.
         */

        VideoGame vg = new VideoGame("Minecraft" , 25);
        System.out.println(vg.getName());
        System.out.println(vg.getPrice());
    }
}