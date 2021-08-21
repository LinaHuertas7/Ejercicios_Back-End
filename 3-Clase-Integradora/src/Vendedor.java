public abstract class Vendedor {
    protected String nombre;
    protected int totalPuntos;
    protected int PUNTOS_POR_VENTA;

    //validar que sea abstracto y lo implementa en las superclases
    public void vender(int cantVentas){
        this.totalPuntos += (this.PUNTOS_POR_VENTA * cantVentas);
        // System.out.println(this.nombre +" realizó "+cantVentas + " ventas.");
    }
    /*Metodo que obtiene los puntos segun ventas*/
    public int getTotalPuntos(){return totalPuntos;};

    /*Metodo que calcula los puntos del Vendedor segun sus aspectos a considerar*/
    public abstract int calcularPuntos();

    /*METODO TEMPLATE - recibe los puntos totales calculados desde la subclase
    y valida cada item para devolver la categoria*/

    public String mostrarCategoria(){
        int puntosDelVendedor = calcularPuntos();

        return this.nombre + " tiene un total de " + puntosDelVendedor + " puntos y categoriza como "+getNombreCategoria() ;
    }

    /*Recibe los puntos, y devuelve una categorizacion*/
    public String getNombreCategoria(){
        int puntosVendedor = calcularPuntos();
        if(puntosVendedor < 20){
            return "novato";
        }else if( puntosVendedor < 31){
            return "aprendiz";
        }else if( puntosVendedor < 41){
            return "bueno";
        }else{
            return "maestro";
        }

    }

}
