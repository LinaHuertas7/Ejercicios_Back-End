package com.company.service.impl;

import com.company.model.Documento;
import com.company.service.IDocumentoService;

import java.util.*;

public class ProxyDocumentoService implements IDocumentoService {

    private IDocumentoService documentoService;
    private List<Map<String, String>> registroUsuarios;

    //Constructor
    public ProxyDocumentoService(IDocumentoService documentoService){
        this.documentoService = documentoService;
        registroUsuarios = new ArrayList<>();
    }

    //Sobreescribimos el metodo d el interfaz
    @Override
    public Documento buscarDocumento(String url, String email) {

        //Accedemos al documento
        Documento documento = documentoService.buscarDocumento(url,email);

        if (documento != null){
            System.out.println("El usuario: " + email + "accediendo al documento con url " + url);
            registroUsuarios.add((Map<String, String>) createSingletonMap(url,email));
            System.out.println("El registro: " + registroUsuarios.toString());

        }else {
            System.out.println("El documento consultado no existe o no tienes acceso");
        }
        return documento;
    }

    private Object createSingletonMap(String key, String value) {
        return Collections.singletonMap(key, value);
    }


}
