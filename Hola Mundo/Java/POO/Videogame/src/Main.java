public class Main {
    public static void main(String[] args) {
        /** EJERCICIO 1
         * Crear la clase VideoGame
         * con las propiedades
         * name string
         * price double
         * catogory string
         *
         * getters y setters para todas las propiedades
         */

        VideoGame juego1 = new VideoGame();
        juego1.setName("Minecraft");
        juego1.setCategory("action");
        System.out.println(juego1.getCategory());
        System.out.println();
    }
}