public class Afiliado extends Vendedor{

    public Afiliado(String nombre){
        super.nombre = nombre;
        super.totalPuntos = 0;
        super.PUNTOS_POR_VENTA = 15;
    }

    @Override
    public int calcularPuntos() {
        return this.totalPuntos;
    }
}
