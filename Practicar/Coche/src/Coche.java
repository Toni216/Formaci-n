public class Coche {
    String marca;
    String modelo;
    int año;
    double velocidadActual = 0;

    Coche(String marca, String modelo, int año, double velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.velocidadActual = velocidadActual;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getAño() {
        return año;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void acelerar(int incremento) {
        this.velocidadActual = velocidadActual + incremento;
    }

    public void frenar(int decremento) {
        if (velocidadActual >= decremento) {
            this.velocidadActual = velocidadActual - decremento;
        } else {
            System.out.println("No se puede frenar tanto.");
        }

    }

    public double obtenerVelocidad() {
        return velocidadActual;
    }

    public void mostrarEstado() {
        System.out.println("== Estado del vehículo: ==");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Velocidad actual: " + obtenerVelocidad());
    }


}
