package com.company.service.impl;

import java.util.Random;

public class CajaService {

    public Integer entregarDinero(Integer monto) {
        Integer dineroAEntregar = null;
        if (hayEfectivo(monto))
            dineroAEntregar = monto;
        System.out.println("Entregando: "+ monto);
        return dineroAEntregar;

    }

    private Boolean hayEfectivo(Integer monto) {
        return new Random().nextBoolean();
    }


}
