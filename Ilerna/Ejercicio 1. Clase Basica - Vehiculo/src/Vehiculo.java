public class Vehículo {
    private String marca;
    private String modelo;
    private int año;

    public void Vehiculo(String marca, String modelo, int año){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public void mostrarInfo() {
        System.out.println("La marca del vehículo es: " + getMarca() + getModelo() + " del año " + getAño());
    }
}
