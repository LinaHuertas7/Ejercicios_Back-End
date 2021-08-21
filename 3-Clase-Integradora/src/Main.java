public class Main {
    public static void main(String[] args) {

        Empleado emp1 = new Empleado("Camila",2); emp1.vender(2);
        Empleado emp2 = new Empleado("Maria",1); emp2.vender(1);

        Vendedor afi1 = new Afiliado("Lina"); afi1.vender(4);
        Vendedor afi2 = new Afiliado("Marcela"); afi2.vender(1);
        Vendedor afi3 = new Afiliado("Lucia");


        emp1.addAfiliado(afi1);

        System.out.println(emp1.mostrarCategoria());

    }
}