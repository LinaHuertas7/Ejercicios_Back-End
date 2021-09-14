package com.company.service.impl;

import com.company.model.Documento;
import com.company.service.IDocumentoService;

import java.util.ArrayList;
import java.util.List;

public class DocumentoService implements IDocumentoService {

    //La lista se utilizara para guardar y buscar los documentos
    private List<Documento> documentos;

    //Constructor
    public DocumentoService(List<Documento> documentos) {
        this.documentos = documentos;
    }

    //Sobreescritura del metodo de la interfaz
    //Buscamos un documento que tenga la misma url, y que el email este en la lista de autorizados para leerlo.
    @Override
    public Documento buscarDocumento(String url, String email) {

        //Se utiliza el .stream().filter() para obtener solo los documentos que cumplen con las condiciones
        //El metodo .contains() se utiliza para verificar si una cadena pertenece a otra cadena.
        //Utilizmos .findFirst() para devolver unicamente el primer elemento y el .orElse si no se encuentra devolver null

        return this.documentos.stream().filter(doc -> doc.getUrl().equals(url) && doc.getUsuariosAutorizados().contains(email)).findFirst().orElse(null);
    }
}
