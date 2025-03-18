package co.edu.konradlorenz.model;

public class tarjetaDebito extends Cuenta {

    public tarjetaDebito() {
    }

    public tarjetaDebito(int numeroCuenta, String propietario, double saldo, int numeroTarjeta, String fechaExpiracion,
            int cvv) {
        super(numeroCuenta, propietario, saldo, numeroTarjeta, fechaExpiracion, cvv);
    }

    public void consignar(double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
            System.out.println("Consignación exitosa. Saldo actual: " + getSaldo());// hacer con lo de ventana
        } else {
            System.out.println("El valor a consignar debe ser mayor que cero.");// hacer con lo de ventana
        }
    }

    public void retirar(double valor) {
        if (valor > 0 && valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            System.out.println("Retiro exitoso. Saldo actual: " + getSaldo());// hacer con lo de ventana
        } else if (valor <= 0) {
            System.out.println("El valor a retirar debe ser mayor que cero.");// hacer con lo de ventana
        } else {
            System.out.println("No hay suficiente saldo para realizar la operación.");// hacer con lo de ventana
        }
    }

}