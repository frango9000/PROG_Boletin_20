package App1;
//@author fsancheztemprano

public class App {

    public static void main(String[] args) {
        LigaFutbol liga = new LigaFutbol(38);
        liga.mostrarTabla();
        System.out.println("Totales");
        liga.mostrarTablaTotales();
        System.out.println("Asc");
        liga.mostrarTablaTotalAsc();

    }
}
