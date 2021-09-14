package com.company.model;

public class Documento {

    //Atributos
    private String contenido;
    private Integer tipo;

    //Constructor

    public Documento(String contenido, Integer tipo) {
        this.contenido = contenido;
        this.tipo = tipo;
    }

    //Getters y Setters

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    //toString

    @Override
    public String toString() {
        return "Documento{" +
                "contenido='" + contenido + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}
