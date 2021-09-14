package com.company.service;


import com.company.model.Documento;

public abstract class EmpleadoPublico {

    public static Integer RESERVADO = 1;
    public static Integer SECRETO = 2;
    public static Integer MUY_SECRETO =3;

    protected  EmpleadoPublico siguienteEmpleado;
    protected Integer tipoDeDocumento;

    public EmpleadoPublico setSiguienteEmpleado(EmpleadoPublico siguienteEmpleado) {
        this.siguienteEmpleado = siguienteEmpleado;
        return this;
    }

    public abstract void leerDocumento(Documento documento);
}
