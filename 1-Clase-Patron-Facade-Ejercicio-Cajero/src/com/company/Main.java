package com.company;

import com.company.service.IFacade;
import com.company.service.impl.AutenticacionService;
import com.company.service.impl.CajaService;
import com.company.service.impl.CuentaService;
import com.company.service.impl.FacadeImpl;

public class Main {

    public static void main(String[] args) {
        IFacade cajeroFacade = new FacadeImpl(new AutenticacionService(),new CajaService(), new CuentaService());

        Boolean dineroEntregado = cajeroFacade.retirarDinero("40234567","qwerty",1000);
        if (!dineroEntregado) {
            System.out.println("No pudimos entregar dinero");
        }
    }
}
