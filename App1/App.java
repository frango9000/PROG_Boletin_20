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
        System.out.printf("El equipo %s en la jornada %d marco %d goles", liga.equipos[3], 18, liga.getGoles(3, 18));

    }
    
    /*
    run:
                 Jornada  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38  Total
  1               Alaves  5  3  2  4  1  5  2  1  3  2  4  1  0  4  5  2  5  3  0  4  4  1  4  1  3  0  0  3  2  0  2  5  1  1  2  1  2  4   92
  2             Athletic  0  4  3  4  1  4  3  5  3  1  1  4  4  3  3  5  1  4  5  1  0  5  0  1  4  1  0  0  5  1  0  3  5  5  2  3  0  1   95
  3   Atletico de Madrid  4  1  1  0  1  1  1  2  4  3  0  5  4  0  5  1  1  3  3  0  4  1  5  0  5  1  0  4  4  2  1  1  5  3  0  4  5  2   87
  4            Barcelona  1  5  4  4  4  5  0  5  1  3  4  0  3  3  1  3  4  4  3  4  2  0  5  2  2  4  4  2  1  0  1  1  2  5  3  2  5  5  107
  5                Betis  1  5  0  1  1  3  1  1  5  5  4  1  3  1  0  2  1  4  1  5  5  5  5  1  0  0  5  5  1  4  0  5  0  4  0  4  4  0   93
  6                Celta  3  3  0  4  5  4  4  3  3  5  5  4  4  3  5  2  5  5  1  2  2  4  3  3  1  3  5  2  5  4  3  2  4  3  4  4  2  3  127
  7                Eibar  1  4  3  0  2  2  5  3  5  3  0  3  4  5  0  1  1  0  1  2  4  5  5  4  4  4  2  2  1  3  5  5  4  3  0  3  2  4  105
  8              Español  2  0  4  1  3  1  3  3  5  2  4  0  3  2  5  5  4  1  1  5  2  2  4  1  5  3  1  5  3  5  4  2  1  2  2  3  1  5  105
  9               Getafe  3  3  1  4  3  1  0  3  0  1  0  2  1  4  3  3  5  3  4  2  3  0  5  0  0  4  4  2  3  2  2  3  4  3  3  0  2  1   87
 10               Girona  0  1  3  0  4  4  1  1  0  1  4  2  1  1  1  4  3  0  0  0  5  5  2  5  1  5  4  1  1  1  4  3  3  0  5  2  0  1   79
 11               Huesca  2  5  4  4  0  1  0  0  1  1  1  5  5  5  3  1  1  4  4  4  5  0  0  0  0  0  2  4  4  5  5  0  0  4  2  3  4  4   93
 12              Leganes  3  4  5  0  2  1  3  1  2  5  3  4  0  0  1  0  1  5  0  1  4  1  2  1  1  0  5  1  1  4  0  3  0  4  2  5  5  1   81
 13              Levante  1  0  3  5  5  3  1  5  0  1  2  5  2  1  5  0  0  0  3  2  2  1  4  1  4  0  4  2  1  1  3  5  3  3  5  0  3  4   90
 14                 Rayo  0  3  2  4  3  0  3  0  3  3  2  5  1  3  5  0  2  2  2  4  4  5  4  4  0  5  1  4  2  2  2  4  0  0  5  5  0  2   96
 15          Real Madrid  4  0  1  0  0  0  5  1  1  4  1  5  1  1  2  1  4  3  3  4  4  1  1  1  0  3  2  5  3  0  5  3  1  0  0  2  2  3   77
 16        Real Sociedad  5  1  5  5  2  3  0  5  4  3  2  5  2  1  4  3  1  0  0  5  1  4  0  3  0  5  1  4  5  4  4  5  2  0  3  3  3  2  105
 17              Sevilla  3  3  1  1  2  4  4  4  4  2  2  5  1  2  4  5  2  1  3  3  4  2  0  4  4  2  4  3  2  1  1  4  4  5  4  1  2  1  104
 18             Valencia  4  0  3  4  2  5  3  4  2  0  2  2  1  1  0  2  2  5  5  5  2  5  0  4  0  1  2  5  5  4  3  3  1  3  3  4  3  2  102
 19           Valladolid  4  4  0  1  0  2  1  2  1  3  3  3  1  4  2  2  5  5  3  3  4  2  4  0  2  5  4  3  4  0  1  3  1  3  3  2  0  0   90
 20            Villareal  3  5  3  4  5  4  0  3  3  1  4  4  0  1  4  2  5  0  3  1  1  4  4  2  0  1  1  0  2  1  5  2  0  5  0  2  5  1   91
                         49 54 48 50 46 53 40 52 50 49 48 65 41 45 58 44 53 52 45 57 62 53 57 38 36 47 51 57 55 44 51 62 41 56 48 53 50 46Totales
  1               Alaves    92
  2             Athletic    95
  3   Atletico de Madrid    87
  4            Barcelona   107
  5                Betis    93
  6                Celta   127
  7                Eibar   105
  8              Español   105
  9               Getafe    87
 10               Girona    79
 11               Huesca    93
 12              Leganes    81
 13              Levante    90
 14                 Rayo    96
 15          Real Madrid    77
 16        Real Sociedad   105
 17              Sevilla   104
 18             Valencia   102
 19           Valladolid    90
 20            Villareal    91
Tabla Ascendente
  0          Real Madrid    77  14
  1               Girona    79   9
  2              Leganes    81  11
  3               Getafe    87   8
  4   Atletico de Madrid    87   2
  5              Levante    90  12
  6           Valladolid    90  18
  7            Villareal    91  19
  8               Alaves    92   0
  9               Huesca    93  10
 10                Betis    93   4
 11             Athletic    95   1
 12                 Rayo    96  13
 13             Valencia   102  17
 14              Sevilla   104  16
 15                Eibar   105   6
 16        Real Sociedad   105  15
 17              Español   105   7
 18            Barcelona   107   3
 19                Celta   127   5
Jornada n2 en orden
  0                Betis     0   4
  1                Celta     0   5
  2           Valladolid     0  18
  3               Getafe     1   8
  4          Real Madrid     1  14
  5              Sevilla     1  16
  6   Atletico de Madrid     1   2
  7                 Rayo     2  13
  8               Alaves     2   0
  9                Eibar     3   6
 10             Athletic     3   1
 11               Girona     3   9
 12             Valencia     3  17
 13              Levante     3  12
 14            Villareal     3  19
 15              Español     4   7
 16               Huesca     4  10
 17            Barcelona     4   3
 18              Leganes     5  11
 19        Real Sociedad     5  15
mayor goleado jornada por jornada
 0        Real Sociedad    5
 1            Villareal    5
 2        Real Sociedad    5
 3        Real Sociedad    5
 4            Villareal    5
 5               Alaves    5
 6                Eibar    5
 7        Real Sociedad    5
 8              Español    5
 9                Betis    5
10                Celta    5
11              Levante    5
12               Huesca    5
13                Eibar    5
14                 Rayo    5
15              Sevilla    5
16            Villareal    5
17              Leganes    5
18             Valencia    5
19        Real Sociedad    5
20               Huesca    5
21                 Rayo    5
22                Betis    5
23               Girona    5
24              Español    5
25        Real Sociedad    5
26                Betis    5
27                Betis    5
28        Real Sociedad    5
29              Español    5
30            Villareal    5
31                Betis    5
32             Athletic    5
33            Villareal    5
34                 Rayo    5
35                 Rayo    5
36            Villareal    5
37              Español    5
jornada top 37
Equipo top en jornada top Español
Equipo top total Celta
Busqueda de goles de un equipo en una jornada:
El equipo Barcelona en la jornada 18 marco 3 golesBUILD SUCCESSFUL (total time: 0 seconds)

    */
}
