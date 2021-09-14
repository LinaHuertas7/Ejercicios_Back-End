package com.company;

public class Usuario {

    //Atributos
    private String id;
    private String tipo;

    //Constructor
    public Usuario(String id, String tipo) {
        this.id=id;
        this.tipo=tipo;
    }

    //Getters y Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
