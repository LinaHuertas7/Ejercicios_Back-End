package pagos.service.impl;

import pagos.model.Tarjeta;
import pagos.model.TarjetaCredito;
import pagos.service.PagoService;

public class ProcesadorCredito extends PagoService {
    @Override
    protected Boolean autorizarPago(Tarjeta tarjeta, Double monto) {
        TarjetaCredito tarjetaPorAutorizar = ((TarjetaCredito) tarjeta);
        Double saldoDisponible = tarjetaPorAutorizar.getLimite()-tarjetaPorAutorizar.getSaldoUtilizado();

        return (saldoDisponible>= monto);
    }
}
