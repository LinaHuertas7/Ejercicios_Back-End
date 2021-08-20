package com.company;

import com.company.model.Direccion;
import com.company.model.Producto;
import com.company.model.Tarjeta;
import com.company.service.ICompraService;
import com.company.service.impl.AlmacenService;
import com.company.service.impl.CompraService;
import com.company.service.impl.EnvioService;
import com.company.service.impl.PagoService;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Producto productoUno = new Producto("1",5,1000,"Mouse");
        Producto productoDos = new Producto("2",5,3000,"Teclado");
        Tarjeta tarjeta  = new Tarjeta("1111222233334444","012","2025/07/09");

        Direccion direccion = new Direccion("Av Monroe","860","1428","CABA","Capital federal");
        ICompraService compraService = new CompraService(new AlmacenService(Arrays.asList(productoUno,productoDos)),new PagoService(),new EnvioService());

        compraService.procesarCompra("1",2,tarjeta,direccion);

    }
}
