package com.company.model;

import java.util.ArrayList;
import java.util.List;

public class Documento {

    //Atributos de la clase
    private String id;
    private String url;
    private String contenido;
    private List<String> usuariosAutorizados;

    //Constructor
    public Documento(String id, String url, List<String> usuariosAutorizados) {
        this.id = id;
        this.url = url;
        this.usuariosAutorizados = usuariosAutorizados;
    }

    //Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<String> getUsuariosAutorizados() {
        return usuariosAutorizados;
    }

    public void setUsuariosAutorizados(List<String> usuariosAutorizados) {
        this.usuariosAutorizados = usuariosAutorizados;
    }
}
