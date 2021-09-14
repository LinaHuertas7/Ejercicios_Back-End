package com.company;

import com.company.model.Documento;
import com.company.service.IDocumentoService;
import com.company.service.impl.DocumentoService;
import com.company.service.impl.ProxyDocumentoService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Documento> documentosGuardados = new ArrayList<>();
        documentosGuardados.add(new Documento("1","www.docs.com/1", Arrays.asList("test1@email.com", "test2@email.com")));
        documentosGuardados.add(new Documento("2","www.docs.com/2", Arrays.asList("test3@email.com", "test2@email.com")));
        IDocumentoService documentoService = new ProxyDocumentoService(new DocumentoService(documentosGuardados));

        documentoService.buscarDocumento("www.docs.com/1","test1@email.com");
        documentoService.buscarDocumento("www.docs.com/1","test2@email.com");
        documentoService.buscarDocumento("www.docs.com/2","test1@email.com"); // este usuario no tiene acceso
        documentoService.buscarDocumento("www.docs.com/2","test2@email.com");


    }
}
