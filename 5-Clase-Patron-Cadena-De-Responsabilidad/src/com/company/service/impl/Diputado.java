package com.company.service.impl;


import com.company.model.Documento;
import com.company.service.EmpleadoPublico;

public class Diputado extends EmpleadoPublico {

    public Diputado(Integer tipo) {
        this.tipoDeDocumento = tipo;
    }
    // A modo de ejemplo solamente imprimimos en consola el acceso.
    @Override
    public void leerDocumento(Documento documento) {
        if(this.tipoDeDocumento >= documento.getTipo())
            System.out.println("Diputado accediendo al documento: "+ documento);
        if(this.siguienteEmpleado != null)
            this.siguienteEmpleado.leerDocumento(documento);
    }
}
