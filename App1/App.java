package App1;
//@author fsancheztemprano

public class App {

    public static void main(String[] args) {
        LigaFutbol liga = new LigaFutbol(38);
        liga.mostrarTabla();
        System.out.println("Totales");
        liga.mostrarTablaTotales();
        System.out.println("Tabla Ascendente");
        liga.mostrarTablaOrdenadaTotal();
        System.out.println("Jornada n2 en orden");
        liga.mostrarTablaJornadaOrdenada(2);
        System.out.println("mayor goleado jornada por jornada");
        liga.mostrarTablaJornadas();
        System.out.println("jornada top " + liga.getTopJornada());
        System.out.println("Equipo top en jornada top " + liga.getTopJornadaString());
        System.out.println("Equipo top total " + liga.getTopEquipoString());
        System.out.println("Busqueda de goles de un equipo en una jornada:");
        System.out.printf("El equipo %s en la jornada %d marco %d goles", liga.equipos[3], 18, liga.getGoles(3, 18) );

    }
}
