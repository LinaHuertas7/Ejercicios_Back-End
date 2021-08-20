public class Facade {

    // Guarda en las variables una instancia de cada otra
    private AvionAPI avionAPI;
    private HotelAPI hotelAPI;

    // Constructor que crea las instancias
    public Facade() {
        avionAPI = new AvionAPI();
        hotelAPI = new HotelAPI();
    }

    //  Simplifica las busquedas de vuelo y hotel
    public void buscar(String fechaIda, String fechaVuelta, String origen, String destino) {
        avionAPI.buscarVuelos(fechaIda, fechaVuelta, origen, destino);
        hotelAPI.buscarHoteles(fechaIda, fechaVuelta, destino);
    }

}
