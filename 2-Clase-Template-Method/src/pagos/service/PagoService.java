package pagos.service;

import pagos.model.Tarjeta;

import java.util.Date;

public abstract class PagoService {

    public Boolean procesarPago(Tarjeta tarjeta, Double monto) {
        Boolean pagoRealizado = Boolean.FALSE;
        System.out.println("Procesando pago...");
        if (tarjeta.getFechaExpiracion().after(new Date())) {
            Boolean pagoAutorizado = autorizarPago(tarjeta, monto);
            if (pagoAutorizado) {
                System.out.println("Realizando el pago...");
                pagoRealizado = Boolean.TRUE;
            }

        }

        return pagoRealizado;


    }

    protected abstract Boolean autorizarPago(Tarjeta tarjeta, Double monto);
}

