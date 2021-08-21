import java.util.ArrayList;

public class Empleado extends Vendedor {

    private int aniosAntiguedad;

    private ArrayList<Vendedor> afiliados = new ArrayList<>();

    public Empleado(String nombre, int aniosAntiguedad){
        super.nombre = nombre;
        super.totalPuntos = 0;
        super.PUNTOS_POR_VENTA = 5;
        this.aniosAntiguedad = aniosAntiguedad;
    }


    /*agrega un afiliado al empleado, y a su vez suma los puntos*/
    public void addAfiliado(Vendedor afiliado){
        this.afiliados.add(afiliado);
        this.totalPuntos += 10;
        System.out.println(afiliado.nombre+ " ahora es afiliado de "+super.nombre);
    }

    //por cada año de antiguedad obtiene 5 puntos extra
    @Override
    public int calcularPuntos() {
        return getTotalPuntos()+(this.aniosAntiguedad*5);
    }
}
