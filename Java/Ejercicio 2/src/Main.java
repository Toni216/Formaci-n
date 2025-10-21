public class Main {
    public static void main(String[] args){
        /**
         * Convertir metros a pulgadas
         * pies, yardas y millas
         */

        double metros = 100.0;
        double pulgadas = metros *  39.37;
        double pies = pulgadas / 12;
        double yardas = pies / 3;
        double millas = pies / 5280;

        System.out.println(metros + " metros son " + pulgadas + " pulgadas");
        System.out.println(metros + " metros son " + pies + " pies");
        System.out.println(metros + " metros son " + yardas + " yardas");
        System.out.println(metros + " metros son " + millas + " millas");
    }
}