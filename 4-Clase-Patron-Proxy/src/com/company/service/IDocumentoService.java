package com.company.service;

import com.company.model.Documento;

public interface IDocumentoService {

    //Generamos el metodo buscarDocumento que se sobreescribira en las clases que implementen la interfaz
    public Documento buscarDocumento(String url, String email);
}
