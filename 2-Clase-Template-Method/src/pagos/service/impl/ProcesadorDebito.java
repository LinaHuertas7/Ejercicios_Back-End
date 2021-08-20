package pagos.service.impl;

import pagos.model.Tarjeta;
import pagos.model.TarjetaDebito;
import pagos.service.PagoService;

public class ProcesadorDebito extends PagoService {


    @Override
    protected Boolean autorizarPago(Tarjeta tarjeta, Double monto) {
        TarjetaDebito tarjetaADebitar = ((TarjetaDebito) tarjeta);
        return (tarjetaADebitar.getSaldo() >= monto);

    }
}
