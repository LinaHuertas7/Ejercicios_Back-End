package pagos.model;

import java.util.Date;

public class Tarjeta {

    private String numerosFrente;
    private String codSeguridad;
    private Date fechaExpiracion;
    private Tipo tipo;


    public Tarjeta(String numerosFrente, String codSeguridad, Date fechaExpiracion, Tipo tipo) {
        this.numerosFrente = numerosFrente;
        this.codSeguridad = codSeguridad;
        this.fechaExpiracion = fechaExpiracion;
        this.tipo = tipo;
    }


    public String getNumerosFrente() {
        return numerosFrente;
    }

    public void setNumerosFrente(String numerosFrente) {
        this.numerosFrente = numerosFrente;
    }

    public String getCodSeguridad() {
        return codSeguridad;
    }

    public void setCodSeguridad(String codSeguridad) {
        this.codSeguridad = codSeguridad;
    }

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}

