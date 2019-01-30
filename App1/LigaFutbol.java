package App1;
//@author fsancheztemprano

import java.util.Random;

public class LigaFutbol {

    public String[] equipos = {"Alaves", "Athletic", "Atletico de Madrid", "Barcelona", "Betis", "Celta", "Eibar", "Español", "Getafe", "Girona", "Huesca", "Leganes", "Levante", "Rayo", "Real Madrid", "Real Sociedad", "Sevilla", "Valencia", "Valladolid", "Villareal"};
    public int[][] tabla;

    public LigaFutbol() {
    }

    public LigaFutbol(int jornadas) {
        this.tabla = new int[equipos.length][jornadas];
        golesRandom();
    }

    public LigaFutbol(int jornadas, String[] equipos) {
        this.equipos = equipos;
        this.tabla = new int[equipos.length][jornadas];
        golesRandom();
    }

    public void golesRandom() {
        Random rand = new Random();
        for (int i = 0; i < equipos.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = rand.nextInt(10);
            }
        }
    }

    public void mostrarTabla() {
        //head
        System.out.printf("%3s %20s", " ","Jornada");
        for (int i= 0;i<tabla[0].length;i++){
            System.out.printf("%3d", i+1);
        }
        System.out.printf("%7s\n","Total");
        //body
        for (int i = 0; i < equipos.length; i++) {
            System.out.printf("%3d %20s", i+1, equipos[i]);
            for (int j = 0; j < tabla[0].length; j++) {
                System.out.printf("%3d", tabla[i][j]);
            }
            System.out.printf("%5d\n",golesDeEquipo(i));
        }
    }
    public void mostrarTablaTotales(){
        for(int i = 0;i<equipos.length;i++){
            System.out.printf("%3d %20s %5d\n", i+1, equipos[i], golesDeEquipo(i));
        }
    }
    public int[] indicesGolesAscendentes(){
        int[] indexReordenados = new int[equipos.length];
        for(int i=0;i<indexReordenados.length;i++){
            indexReordenados[i]=i;
        }
        
        for(int i =0;i<equipos.length;i++){
            for(int j = 0;j<equipos.length;j++){
                if(j==i)continue;
                if(golesDeEquipo(i)>golesDeEquipo(j)){
                    indexReordenados[i]=j;
                    indexReordenados[j]=i;
                }
            }
        }
        return indexReordenados;
    }
    public void mostrarTablaTotalAsc(){
        int[] index=indicesGolesAscendentes();
        for(int i = 0;i<equipos.length;i++){
            System.out.printf("%3d %20s %5d\n", i+1, equipos[index[i]], golesDeEquipo(index[i]));
        }
        
    }
    public int indiceDeEquipo(String nombre){
        for(int i =0;i<equipos.length;i++){
            if(equipos[i].equalsIgnoreCase(nombre)){
                return i;
            }
        }
        return -1;
    }
    
    public int golesDeEquipo(String nombre){
        return golesDeEquipo(indiceDeEquipo(nombre));
    }
    
    public int golesDeEquipo(int index){
        int goles = 0;
        for(int i = 0;i<tabla[index].length;i++){
            goles+=tabla[index][i];
        }
        return goles;
    }

}
