package co.edu.konradlorenz.model;

public class tarjetaCredito extends Cuenta {
    private double limiteCredito;
    private double interes;
    private double deuda;

    public tarjetaCredito() {
    }


    public tarjetaCredito(int numeroCuenta, String propietario, double saldo, int numeroTarjeta, String fechaExpiracion, int cvv, double limiteCredito, double interes, double deuda) {
        super(numeroCuenta, propietario, saldo, numeroTarjeta, fechaExpiracion, cvv);
        this.limiteCredito = limiteCredito;
        this.interes = interes;
        this.deuda = deuda;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

    @Override
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

    public void pagarDeuda(double valor) {
        if (valor > 0 && valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            setDeuda(getDeuda() - valor);
            System.out.println("Pago de deuda exitoso. Saldo actual: " + getSaldo());// hacer con lo de ventana
        } else if (valor <= 0) {
            System.out.println("El valor a pagar debe ser mayor que cero.");// hacer con lo de ventana
        } else {
            System.out.println("No hay suficiente saldo para realizar la operación.");// hacer con lo de ventana
        }
    }
}
