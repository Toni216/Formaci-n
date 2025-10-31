public class Persona {
    String name;
    String primerApellido;
    String segundoApellido;
    int edad;
    String dni;

    Persona(String name, String primerApellido, String segundoApellido, int edad, String dni) {
        this.name = name;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.edad = edad;
    }

    String nombreCompleto() {
        return name + " " + primerApellido + " " + segundoApellido;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void mostrarInfo(){
        System.out.println("Tu nombre completo es: " + nombreCompleto());
        System.out.println("Tu edad es: " + getEdad());
        System.out.println("Tu dni es: " + getDni());
    }
}
