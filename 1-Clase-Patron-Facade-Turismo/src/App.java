public class App {

    public static void main(String[] args) {

        // crea el cliente del facade
        Facade cliente1 = new Facade();
        // pide una busqueda
        cliente1.buscar("02/07/2018", "08/07/2018", "Lima", "Cancún");


        // crea el cliente del facade
        Facade cliente2 = new Facade();
        // pide una busqueda
        cliente2.buscar("02/07/2018", "08/07/2018", "Lima", "Quito");
    }

}
