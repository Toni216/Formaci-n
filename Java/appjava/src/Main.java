public class Main {
    public static void main(String[] args){
        // Conversión implícita
        byte a = 1;
        double b = 15.15;
        double c = a + b;
        System.out.println(c);

        // Conversión explícita
        int x = 15;
        double y = 15.015;
        int z = (int) (x + y);
        System.out.println(z);
    }
}