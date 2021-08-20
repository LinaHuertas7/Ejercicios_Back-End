package pagos.model;

import java.util.Date;

public class TarjetaDebito extends Tarjeta{
    private Double saldo;
    public TarjetaDebito(String numerosFrente, String codSeguridad, Date fechaExpiracion, Tipo tipo, Double saldo) {
        super(numerosFrente, codSeguridad, fechaExpiracion, tipo);
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}