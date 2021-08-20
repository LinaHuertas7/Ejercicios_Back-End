package com.company.service.impl;

import com.company.model.Cuenta;
import com.company.service.IFacade;

public class FacadeImpl implements IFacade {
    private AutenticacionService autenticacionService;
    private CajaService cajaService;
    private CuentaService cuentaService;

    public FacadeImpl(AutenticacionService autenticacionService, CajaService cajaService, CuentaService cuentaService) {
        this.autenticacionService = autenticacionService;
        this.cajaService = cajaService;
        this.cuentaService = cuentaService;
    }

    @Override
    public Boolean retirarDinero(String identificacionCliente, String contrasena, Integer montoARetirar) {
        Boolean dineroEntregado = Boolean.FALSE;
        if (autenticacionService.validarUsuarioYContrasena(identificacionCliente, contrasena)) {
            Cuenta cuenta = cuentaService.getCuenta(identificacionCliente);
            if (montoARetirar <= cuenta.getSaldo())
                dineroEntregado = (cajaService.entregarDinero(montoARetirar) != null);

        }
        return dineroEntregado;
    }
}
