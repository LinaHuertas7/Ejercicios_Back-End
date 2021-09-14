package com.company;

import com.company.model.Documento;
import com.company.service.EmpleadoPublico;
import com.company.service.impl.Diputado;
import com.company.service.impl.Ministro;
import com.company.service.impl.Presidente;

public class Main {

    public static void main(String[] args) {
	// write your code here
        EmpleadoPublico manejadorBase = new Diputado(1).setSiguienteEmpleado(new Ministro(2).setSiguienteEmpleado(new Presidente(3)));
        //El documento lo leeran todos los manejadores hasta que termine la cadena
        manejadorBase.leerDocumento(new Documento("DNU vacunas : Con el objetivo de conseguir la mayor cantidad de vacunas lo antes posible, la nueva norma abre tres posibilidades para recibir dosis: los convenios con laboratorios, el mecanismo Covax y las oportunidades de donaciones de diferentes Estados, fundamentalmente de Estados Unidos",1));
        //El documento lo leera solamente el presidente
        manejadorBase.leerDocumento(new Documento("Resultados encuestas internas",3));
    }
}
