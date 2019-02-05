package App2;
//@author fsancheztemprano

public class App {

    public static void main(String[] args) {
        int filas = 13;
        int[][] piramide = new int[filas][(filas * 2) - 1];
        for (int i = 0; i < piramide.length; i++) {
            for (int j = 0; j < piramide[i].length; j++) {
                if (i == 0) {
                    piramide[i][filas-1] = 1;
                }else if(j==0){
                  piramide[i][j]=piramide[i-1][j+1];
                }else if(j== piramide[i].length-1){
                  piramide[i][j]=piramide[i-1][j-1];
                }else {
                    piramide[i][j] = piramide[i-1][j-1] + piramide[i-1][j+1];
                }

            }

        }

        for (int i = 0; i < piramide.length; i++) {
            for (int j = 0; j < (filas * 2) - 1; j++) {
                if (piramide[i][j] == 0) {
                    System.out.print("  ");
                } else {
                    System.out.printf("%3s", String.valueOf(piramide[i][j]));
                }
            }
            System.out.println("\n");
        }
    }
}
