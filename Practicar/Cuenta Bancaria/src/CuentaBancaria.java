public class CuentaBancaria {
    int numeroCuenta;
    String titular;
    private double saldo;

    CuentaBancaria(int numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public double depositar(double monto) {
        return saldo = monto + saldo;
    }

    public double retirar(double monto) {
        if (monto <= saldo) {
             saldo = saldo - monto;
        } else {
            System.out.println("Esta operación no es posible.");
        }

        return saldo;

    }

    public double consultarSaldo() {
        return saldo;
    }

    public void mostrarInformacion() {
        System.out.println("¡Saludos! " + titular);
        System.out.println("El saldo de su cuenta " + numeroCuenta + " es de " + consultarSaldo());
    }
}
