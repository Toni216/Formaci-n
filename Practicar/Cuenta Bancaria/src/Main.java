public class Main {
    public static void main(String[] args) {
        // Crea una clase CuentaBancaria con:
        // - Atributos: numeroCuenta, titular, saldo (private)
        // - Métodos:
        //   • constructor que reciba numeroCuenta, titular y saldo inicial
        //   • depositar(double monto)
        //   • retirar(double monto) - validar que haya saldo suficiente
        //   • consultarSaldo()
        //   • mostrarInformacion()

        CuentaBancaria cb = new CuentaBancaria(45455454,"Paco",0);
        System.out.println(cb.consultarSaldo());
        double depositar = cb.depositar(20);
        System.out.println(cb.consultarSaldo());
        double retirar = cb.retirar(25);
        System.out.println(cb.consultarSaldo());

        cb.mostrarInformacion();
    }
}