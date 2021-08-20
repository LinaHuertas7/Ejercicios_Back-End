package com.company.service.impl;

import java.util.Random;

public class AutenticacionService  {


    public Boolean validarUsuarioYContrasena(String usuario, String contrasena) {
        System.out.println("Validando usuario: " + usuario);
        Boolean datosValidos = Boolean.FALSE;
        if (usuario != null & contrasena != null)
            datosValidos = validar(usuario, contrasena);

        return datosValidos;
    }

    private Boolean validar(String usuario, String contrasena) {
        return new Random().nextBoolean();
    }
}
