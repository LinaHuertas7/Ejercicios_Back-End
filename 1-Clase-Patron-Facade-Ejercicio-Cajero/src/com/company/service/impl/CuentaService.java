package com.company.service.impl;

import com.company.model.Cuenta;

public class CuentaService {


    public Cuenta getCuenta(String identificadorUsuario){
        System.out.println("Buscando cuenta..");
        return  new Cuenta(identificadorUsuario,10000);

    }


}
