public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("renault","laguna",2005);
        Vehiculo juan = new Vehiculo("toyota", "yaris" , 2021);

        vehiculo.mostrarInfo();

        vehiculo.setMarca("Toyota");
        vehiculo.setModelo("Camris");
        vehiculo.setAño(2023);

        vehiculo.mostrarInfo();
        juan.mostrarInfo();
    }
}