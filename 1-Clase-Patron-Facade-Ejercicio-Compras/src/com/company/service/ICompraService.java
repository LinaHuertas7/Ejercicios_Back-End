package com.company.service;

import com.company.model.Direccion;
import com.company.model.Tarjeta;

public interface ICompraService {

    public void procesarCompra(String productoId, Integer cantidad, Tarjeta tarjeta, Direccion direccion);
}